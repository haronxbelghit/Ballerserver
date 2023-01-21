package com.example.models

data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val players: List<Player> = emptyList(),
)
