package com.aditys.threads.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.aditys.threads.R
import com.aditys.threads.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun Splash(navController : NavHostController){
    ConstraintLayout (modifier = Modifier.fillMaxSize()){
        val logo = createRef()

        Image(
            painter = painterResource(id = R.drawable.thr),
            contentDescription = "mainScreen",
            modifier = Modifier
                .constrainAs(logo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .fillMaxSize(),
            alignment = Alignment.Center
        )
    }

    LaunchedEffect(true ) {
        delay(3000)
        navController.navigate(Routes.BottomNav.routes)
    }
}
