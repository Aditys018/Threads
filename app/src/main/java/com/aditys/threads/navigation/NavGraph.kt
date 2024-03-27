package com.aditys.threads.navigation

import android.provider.ContactsContract
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aditys.threads.screens.AddThreads
import com.aditys.threads.screens.BottomNav
import com.aditys.threads.screens.Home
import com.aditys.threads.screens.Login
import com.aditys.threads.screens.Notification
import com.aditys.threads.screens.Profile
import com.aditys.threads.screens.Register
import com.aditys.threads.screens.Search
import com.aditys.threads.screens.Splash

@Composable
fun NavGraph(navController: NavHostController){

    NavHost(navController = navController,
        startDestination=Routes.Splash.routes){

        composable(Routes.Splash.routes){
            Splash(navController)
        }

        composable(Routes.Home.routes){
            Home()
        }
        composable(Routes.Notification.routes){
            Notification()
        }
        composable(Routes.Search.routes){
            Search()
        }
        composable(Routes.AddThread.routes){
            AddThreads()
        }
       composable(Routes.Profile.routes){
           Profile()
       }

        composable(Routes.BottomNav.routes){
            BottomNav(navController)
        }

        composable(Routes.Login.routes){
            Login(navController)
        }

        composable(Routes.Register.routes){
            Register(navController)
        }

    }

}


