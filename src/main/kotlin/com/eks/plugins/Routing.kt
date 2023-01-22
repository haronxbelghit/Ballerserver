package com.eks.plugins

import com.eks.routes.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        getAllPlayers()
        searchPlayers()
        static("/images") {
            resources("images")
        }
    }
}
