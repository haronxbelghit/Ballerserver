package com.example.routes

import com.example.repository.PlayerRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchPlayers() {
    val playerRepository: PlayerRepository by inject()

    get("/players/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = playerRepository.searchPlayers(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}