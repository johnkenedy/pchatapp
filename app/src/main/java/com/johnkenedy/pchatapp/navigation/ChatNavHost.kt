package com.johnkenedy.pchatapp.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// We gonna create this navigation with nav2, but in the future we gonna refactor to nav3,
// so you can see how you would do in a real project
const val SPLASH_ROUTE = "splash"
const val SIGN_IN_ROUTE = "signIn"
const val SIGN_UP_ROUTE = "signUp"


@Composable
fun ChatNavHost() {
    //  about this remember here, we will learn about this later, but basically this function will
    // remember the state of the navController across recompositions, that is when this function is called
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = SPLASH_ROUTE) {
        composable(SPLASH_ROUTE) {
            Text(text = "Splash")
        }
        composable(SIGN_IN_ROUTE) {}
        composable(SIGN_UP_ROUTE) {}
    }
}

//rememberNavController(): Composable functions can be "recomposed" (re-run) many times.
//The remember function ensures that the state,
//the navController—is preserved across these recompositions.
//Without remember, a new NavController would be created every time ChatNavHost recomposes,
//causing your navigation state to be lost.
//This navController instance should be created at a high level in your composable hierarchy
//so it can be shared by all screens that need it.


//The NavHost acts as a container that displays the current destination (screen) based on the navController's state.

//startDestination tells the NavHost which screen to show when the app first loads.

// In the next class we gonna import our assets, and then we gonna start create our screens,
// So lets keep it going, and I see you in the next video.