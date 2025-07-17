package com.efradev.platform.mcp.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.headers


const val URL = "https://platform-production-dbfb.up.railway.app/"
val httpClientPlatformApi = HttpClient {
    defaultRequest {
        url(URL)
        headers {
            append("content-type", "application/json")
        }
    }
}