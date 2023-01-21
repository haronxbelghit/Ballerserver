package com.example.models

data class Player(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val squad: List<String>,
    val abilities: List<String>,
    val playerTypes: List<String>
)
