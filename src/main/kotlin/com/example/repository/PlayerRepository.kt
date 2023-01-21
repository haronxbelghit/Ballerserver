package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Player

interface PlayerRepository {

    val players: Map<Int, List<Player>>

    val page1: List<Player>
    val page2: List<Player>
    val page3: List<Player>
    val page4: List<Player>
    val page5: List<Player>
    val page6: List<Player>
    val page7: List<Player>
    val page8: List<Player>

    suspend fun getAllPlayers(page: Int = 1): ApiResponse
    suspend fun searchPlayers(name: String?): ApiResponse
}