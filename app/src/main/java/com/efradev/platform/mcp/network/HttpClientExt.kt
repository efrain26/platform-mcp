package com.efradev.platform.mcp.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

suspend fun HttpClient.getPlatformApi(): String {
    return this.get("/openapi.json").body<String>()
}