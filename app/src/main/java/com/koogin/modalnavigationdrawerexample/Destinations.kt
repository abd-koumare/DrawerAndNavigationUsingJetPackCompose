package com.koogin.modalnavigationdrawerexample

interface Destinations {
    val route: String
}

object Home : Destinations {
    override val route = "Home"
}

object Menu : Destinations {
    override val route = "Menu"
}