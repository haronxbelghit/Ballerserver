package com.eks.models

import kotlinx.serialization.Serializable

@Serializable
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
