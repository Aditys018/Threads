package com.aditys.threads.navigation

sealed class Routes (val routes: String){
    object Home: Routes("home")
    object Notification: Routes("Notification")
    object Profile: Routes("Profile")
    object Search: Routes("Search")
    object Splash: Routes("Splash")
    object AddThread: Routes("AddThread")
}