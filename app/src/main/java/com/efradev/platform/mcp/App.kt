package com.efradev.platform.mcp

import com.efradev.platform.mcp.network.getPlatformApi
import com.efradev.platform.mcp.network.httpClientPlatformApi
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
            name = "efrainMCP", // Tool name is "weather"
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
        name = "FastAPI Documentation Context for ToDoList App",
        description = """
            URL para validar los endpoints que se estan trabajando para el proyecto ToDoList,
            aqui podemos checar que Api's existen y cuales son los header que se ocupan o los modelos.
        """.trimIndent(),

        ) { request ->
        val forecast = httpClientPlatformApi.getPlatformApi()
        CallToolResult(content = listOf(TextContent(forecast.toString())))
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
