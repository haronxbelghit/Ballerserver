package com.eks.repository

import com.eks.models.ApiResponse
import com.eks.models.Player


const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class PlayerRepositoryImpl : PlayerRepository {

    override val players: Map<Int, List<Player>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5,
            6 to page6,
            7 to page7,
            8 to page8
        )
    }

    //GK
    override val page1 = listOf(
        Player(
            id = 1,
            name = "Yassine Bono",
            image = "/images/yassine_bono.jpg",
            about = "Yassine Bono is a Moroccan professional footballer who plays as a goalkeeper for the Moroccan national team and Spanish club UD Almería.",
            rating = 7.0,
            power = 80,
            month = "june",
            day = "5",
            squad = listOf("Moroccan national team"),
            abilities = listOf("Shot Stopping", "Aerial ability", "Communication", "Quick Reflexes"),
            playerTypes = listOf("Goalkeeper")
        ),
        Player(
            id = 10,
            name = "Munir",
            image = "/images/munir.jpg",
            about = "Munir is a Moroccan professional footballer who plays as a goalkeeper for the Moroccan national team and Saudi club Al Wehda.",
            rating = 7.5,
            power = 80,
            month = "january",
            day = "5",
            squad = listOf("Moroccan national team", "Al Wehda"),
            abilities = listOf("Shot Stopping", "Aerial ability", "Communication", "Quick Reflexes"),
            playerTypes = listOf("Goalkeeper")
        ),
        Player(
            id = 11,
            name = "Ahmed Reda Tagnaouti",
            image = "/images/ahmed_reda_tagnaouti.jpg",
            about = "Ahmed Reda Tagnaouti is a Moroccan professional footballer who plays as a goalkeeper for the Moroccan national team and Moroccan club Wydad Casablanca.",
            rating = 7.0,
            power = 75,
            month = "february",
            day = "15",
            squad = listOf("Moroccan national team", "Wydad Casablanca"),
            abilities = listOf("Shot Stopping", "Aerial ability", "communication", "quick reflexes"),
            playerTypes = listOf("Goalkeeper")
        )
    )

    //Defenders
    override val page2 = listOf(
        Player(
            id = 2,
            name = "Achraf Hakimi",
            image = "/images/achraf_hakimi.jpg",
            about = "Achraf Hakimi is a Moroccan professional footballer who plays as a right-back for the Moroccan national team and English club Chelsea FC.",
            rating = 8.5,
            power = 85,
            month = "november",
            day = "25",
            squad = listOf("Moroccan national team", "Chelsea FC"),
            abilities = listOf("speed", "dribbling", "tackling", "crossing"),
            playerTypes = listOf("Defender", "Midfielder")
        ),
        Player(
            id = 3,
            name = "Noussair Mazraoui",
            image = "/images/noussair_mazraoui.jpg",
            about = "Noussair Mazraoui is a Moroccan professional footballer who plays as a right-back for the Moroccan national team and German club Bayern Munich.",
            rating = 7.5,
            power = 80,
            month = "january",
            day = "12",
            squad = listOf("Moroccan national team", "Bayern Munich"),
            abilities = listOf("speed", "dribbling", "tackling", "crossing"),
            playerTypes = listOf("Defender", "Midfielder")
        ),
        Player(
            id = 4,
            name = "Romain Saiss",
            image = "/images/romain_saiss.jpg",
            about = "Romain Saiss is a Moroccan professional footballer who plays as a central defender for the Moroccan national team and Turkish club Besiktas.",
            rating = 7.0,
            power = 80,
            month = "june",
            day = "5",
            squad = listOf("Moroccan national team", "Besiktas"),
            abilities = listOf("marking", "heading", "communication", "positioning"),
            playerTypes = listOf("Defender")
        )
    )
    override val page3 = listOf(
        Player(
            id = 5,
            name = "Nayef Aguerd",
            image = "/images/nayef_aguerd.jpg",
            about = "Nayef Aguerd is a Moroccan professional footballer who plays as a central defender for the Moroccan national team and English club West Ham United.",
            rating = 7.5,
            power = 80,
            month = "august",
            day = "7",
            squad = listOf("Moroccan national team", "West Ham United"),
            abilities = listOf("marking", "heading", "communication", "positioning"),
            playerTypes = listOf("Defender")
        ),
        Player(
            id = 6,
            name = "Achraf Dari",
            image = "/images/achraf_dari.jpg",
            about = "Achraf Dari is a Moroccan professional footballer who plays as a central defender for the Moroccan national team and French club Brest.",
            rating = 6.5,
            power = 75,
            month = "may",
            day = "12",
            squad = listOf("Moroccan national team", "Brest"),
            abilities = listOf("marking", "heading", "communication", "positioning"),
            playerTypes = listOf("Defender")
        ),
        Player(
            id = 7,
            name = "Jawad El-Yamiq",
            image = "/images/jawad_el-yamiq.jpg",
            about = "Jawad El-Yamiq is a Moroccan professional footballer who plays as a central defender for the Moroccan national team and Spanish club Valladolid.",
            rating = 7.0,
            power = 75,
            month = "october",
            day = "15",
            squad = listOf("Moroccan national team", "Valladolid"),
            abilities = listOf("marking", "heading", "communication", "positioning"),
            playerTypes = listOf("Defender")
        )
    )
    override val page4 = listOf(
        Player(
            id = 8,
            name = "Yahia Attiat-Allah",
            image = "/images/yahia_attiat-allah.jpg",
            about = "Yahia Attiat-Allah is a Moroccan professional footballer who plays as a midfielder for the Moroccan national team and Moroccan club Wydad Casablanca.",
            rating = 7.0,
            power = 75,
            month = "march",
            day = "20",
            squad = listOf("Moroccan national team", "Wydad Casablanca"),
            abilities = listOf("passing", "dribbling", "tackling", "vision"),
            playerTypes = listOf("Midfielder")
        ),
        Player(
            id = 9,
            name = "Badr Benoun",
            image = "/images/badr_benoun.jpg",
            about = "Badr Benoun is a Moroccan professional footballer who plays as a forward for the Moroccan national team and Qatari club Qatar SC.",
            rating = 7.0,
            power = 75,
            month = "december",
            day = "25",
            squad = listOf("Moroccan national team", "Qatar SC"),
            abilities = listOf("finishing", "dribbling", "speed", "off the ball movement"),
            playerTypes = listOf("Forward")
        )
    )

    //Midfielders
    override val page5 = listOf(
        Player(
            id = 12,
            name = "Sofyan Amrabat",
            image = "/images/sofyan_amrabat.jpg",
            about = "Sofyan Amrabat is a Moroccan professional footballer who plays as a midfielder for the Moroccan national team and Italian club Fiorentina.",
            rating = 7.5,
            power = 80,
            month = "january",
            day = "2",
            squad = listOf("Moroccan national team", "Fiorentina"),
            abilities = listOf("passing", "dribbling", "tackling", "vision"),
            playerTypes = listOf("Midfielder")
        ),
        Player(
            id = 13,
            name = "Selim Amallah",
            image = "/images/selim_amallah.jpg",
            about = "Selim Amallah is a Moroccan professional footballer who plays as a midfielder for the Moroccan national team and Belgian club Standard Liege.",
            rating = 7.0,
            power = 75,
            month = "march",
            day = "5",
            squad = listOf("Moroccan national team", "Standard Liege"),
            abilities = listOf("passing", "dribbling", "tackling", "vision"),
            playerTypes = listOf("Midfielder")
        ),
        Player(
            id = 14,
            name = "Abdelhamid Sabiri",
            image = "/images/abdelhamid_sabiri.jpg",
            about = "Abdelhamid Sabiri is a Moroccan professional footballer who plays as a midfielder for the Moroccan national team and Italian club Sampdoria.",
            rating = 7.0,
            power = 75,
            month = "august",
            day = "20",
            squad = listOf("Moroccan national team", "Sampdoria"),
            abilities = listOf("passing", "dribbling", "tackling", "vision"),
            playerTypes = listOf("Midfielder")
        )
    )
    override val page6 = listOf(
        Player(
            id = 15,
            name = "Azzedine Ounahi",
            image = "/images/azzedine_ounahi.jpg",
            about = "Azzedine Ounahi is a Moroccan professional footballer who plays as a defender for the Moroccan national team and French club Angers.",
            rating = 6.5,
            power = 75,
            month = "september",
            day = "1",
            squad = listOf("Moroccan national team", "Angers"),
            abilities = listOf("marking", "heading", "communication", "positioning"),
            playerTypes = listOf("Defender")
        ),
        Player(
            id = 16,
            name = "Bilel El Khanouss",
            image = "/images/bilel_el_khanouss.jpg",
            about = "Bilel El Khanouss is a Moroccan professional footballer who plays as a forward for the Moroccan national team and Belgian club Genk.",
            rating = 7.0,
            power = 75,
            month = "november",
            day = "15",
            squad = listOf("Moroccan national team", "Genk"),
            abilities = listOf("finishing", "dribbling", "speed", "off the ball movement"),
            playerTypes = listOf("Forward")
        ),
        Player(
            id = 17,
            name = "Yahya Jabrane",
            image = "/images/yahya_jabrane.jpg",
            about = "Yahya Jabrane is a Moroccan professional footballer who plays as a midfielder for the Moroccan national team and Moroccan club Wydad Casablanca.",
            rating = 7.0,
            power = 75,
            month = "december",
            day = "25",
            squad = listOf("Moroccan national team", "Wydad Casablanca"),
            abilities = listOf("passing", "dribbling", "tackling", "vision"),
            playerTypes = listOf("Midfielder")
        )
    )

    //Attack
    override val page7 = listOf(
        Player(
            id = 18,
            name = "Hakim Ziyech",
            image = "/images/hakim_ziyech.jpg",
            about = "Hakim Ziyech is a Moroccan professional footballer who plays as a attacking midfielder for the Moroccan national team and English club Chelsea.",
            rating = 8.0,
            power = 85,
            month = "january",
            day = "10",
            squad = listOf("Moroccan national team", "Chelsea"),
            abilities = listOf("dribbling", "passing", "vision", "free kick"),
            playerTypes = listOf("Midfielder")
        ),
        Player(
            id = 19,
            name = "Youssef En-Nesyri",
            image = "/images/youssef_en-nesyri.jpg",
            about = "Youssef En-Nesyri is a Moroccan professional footballer who plays as a forward for the Moroccan national team and Spanish club Sevilla.",
            rating = 7.5,
            power = 80,
            month = "february",
            day = "20",
            squad = listOf("Moroccan national team", "Sevilla"),
            abilities = listOf("finishing", "dribbling", "speed", "off the ball movement"),
            playerTypes = listOf("Forward")
        ),
        Player(
            id = 20,
            name = "Sofiane Boufal",
            image = "/images/sofiane_boufal.jpg",
            about = "Sofiane Boufal is a Moroccan professional footballer who plays as a forward for the Moroccan national team and French club Angers.",
            rating = 7.5,
            power = 80,
            month = "march",
            day = "5",
            squad = listOf("Moroccan national team", "Angers"),
            abilities = listOf("finishing", "dribbling", "speed", "off the ball movement"),
            playerTypes = listOf("Forward")
        )
    )
    override val page8 = listOf(
        Player(
            id = 21,
            name = "Zakaria Aboukhlal",
            image = "/images/zakaria_aboukhlal.jpg",
            about = "Zakaria Aboukhlal is a Moroccan professional footballer who plays as a forward for the Moroccan national team and French club Toulouse.",
            rating = 7.0,
            power = 75,
            month = "april",
            day = "10",
            squad = listOf("Moroccan national team", "Toulouse"),
            abilities = listOf("finishing", "dribbling", "speed", "off the ball movement"),
            playerTypes = listOf("Forward")
        ),
        Player(
            id = 22,
            name = "Ez Abde",
            image = "/images/ez_abde.jpg",
            about = "Ez Abde is a Moroccan professional footballer who plays as a defender for the Moroccan national team and Spanish club Osasuna.",
            rating = 6.5,
            power = 75,
            month = "may",
            day = "15",
            squad = listOf("Moroccan national team", "Osasuna"),
            abilities = listOf("marking", "heading", "communication", "positioning"),
            playerTypes = listOf("Defender")
        ),
        Player(
            id = 23,
            name = "Amine Harit",
            image = "/images/amine_harit.jpg",
            about = "Amine Harit is a Moroccan professional footballer who plays as a midfielder for the Moroccan national team and French club Olympique Marseille.",
            rating = 7.5,
            power = 80,
            month = "june",
            day = "20",
            squad = listOf("Moroccan national team", "Olympique Marseille"),
            abilities = listOf("passing", "dribbling", "tackling", "vision"),
            playerTypes = listOf("Midfielder")
        )
    )

    override suspend fun getAllPlayers(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            players = players[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..7) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..8) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 8) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchPlayers(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            players = findPlayers(query = name)
        )
    }

    private fun findPlayers(query: String?): List<Player> {
        val found = mutableListOf<Player>()
        return if (!query.isNullOrEmpty()) {
            players.forEach { (_, players) ->
                players.forEach { player ->
                    if (player.name.lowercase().contains(query.lowercase())) {
                        found.add(player)
                    }
                }
            }
            found
        } else {
            emptyList()
        }
    }
}