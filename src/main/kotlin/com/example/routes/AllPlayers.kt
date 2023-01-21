package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.PlayerRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException

fun Route.getAllPlayers() {

    val playerRepository: PlayerRepository by inject()

    get("/players") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..8)
            val apiResponse = playerRepository.getAllPlayers(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(
                    success = false,
                    message = "Not allowed"
                ),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(
                    success = false,
                    message = "Not found"
                ),
                status = HttpStatusCode.NotFound
            )
        }

    }
}