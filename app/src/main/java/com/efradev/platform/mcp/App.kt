package com.efradev.platform.mcp

import com.efradev.platform.mcp.network.getPlatformApi
import com.efradev.platform.mcp.network.httpClientPlatformApi
import com.efradev.platform.mcp.network.httpClientPlatformListApi
import io.ktor.utils.io.streams.asInput
import io.modelcontextprotocol.kotlin.sdk.CallToolResult
import io.modelcontextprotocol.kotlin.sdk.Implementation
import io.modelcontextprotocol.kotlin.sdk.ServerCapabilities
import io.modelcontextprotocol.kotlin.sdk.TextContent
import io.modelcontextprotocol.kotlin.sdk.server.Server
import io.modelcontextprotocol.kotlin.sdk.server.ServerOptions
import io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport
import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking
import kotlinx.io.asSink
import kotlinx.io.buffered
import java.io.File

fun main() = run()
/**
 *  https://api.weather.gov/
 *  Latitud: 40.712728 | Longitud: -74.006015
 *  ciudad CA en US
 *  https://github.com/modelcontextprotocol
 *  https://modelcontextprotocol.io/introduction
 * */
// Main function to run the MCP server
fun run() {
    // Create the MCP Server instance with a basic implementation
    val server = Server(
        Implementation(
            name = "platform-tools", // Tool name is "weather"
            version = "1.0.0" // Version of the implementation
        ),
        ServerOptions(
            capabilities = ServerCapabilities(tools = ServerCapabilities.Tools(listChanged = true))
        )
    )

    // Create a transport using standard IO for server communication
    val transport = StdioServerTransport(
        System.`in`.asInput(),
        System.out.asSink().buffered()
    )

    server.addTool(
        name = "Auth Microservice - FastAPI Documentation",
        description = """
            Consulta json de los servicios de Auth en fastAPI
        """.trimIndent(),

        ) { request ->
        val forecast = httpClientPlatformApi.getPlatformApi()
        CallToolResult(content = listOf(TextContent(forecast.toString())))
    }

    server.addTool(
        name = "Lists Microservice - FastAPI Documentation",
        description = """
            Consulta json de los servicios de Lists en fastAPI
        """.trimIndent(),

        ) { request ->
        val forecast = httpClientPlatformListApi.getPlatformApi()
        CallToolResult(content = listOf(TextContent(forecast.toString())))
    }

    server.addTool(
        name = "Workflow to generate a backend ticket",
        description = """
            Consultar la documentacion para saber el workflow de backend de como generar un ticket 
            con ayuda de la IA, tambien puede consultar el template del ticket de backend.
            Retorna el contenido del WORKFLOW.md y TEMPLATE-TICKET.md para guiar la creacion de tickets.
        """.trimIndent(),

        ) { request ->
        try {
            val workflowContent = File("files/WORKFLOW.md").readText()
            val templateContent = File("files/TEMPLATE-TICKET.md").readText()
            
            val combinedContent = """
                ## 📋 WORKFLOW DE TICKETS
                
                $workflowContent
                
                ---
                
                ## 📝 TEMPLATE DE TICKET
                
                $templateContent
            """.trimIndent()
            
            CallToolResult(content = listOf(TextContent(combinedContent)))
        } catch (e: Exception) {
            CallToolResult(content = listOf(TextContent("Error al leer los archivos de documentación: ${e.message}")))
        }
    }

    runBlocking {
        val done = Job()
        server.onClose {
            done.complete()
        }
        server.connect(transport)
        done.join()
    }


}
