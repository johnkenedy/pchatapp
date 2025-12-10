package com.johnkenedy.pchatapp.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.johnkenedy.pchatapp.ui.feature.splash.SplashRoute
import kotlinx.coroutines.delay
import kotlinx.serialization.Serializable

@Serializable
object SplashRoute

@Serializable
data class SignInRoute(
    val email: String,
    val password: String
)

@Serializable
object SignUpRoute

@Composable
fun ChatNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = SplashRoute) {
        composable<SplashRoute> {
            SplashRoute()
            LaunchedEffect(Unit) {
                delay(2000)
                navController.navigate(SignInRoute("John@test.com", "123"))
            }
        }
        composable<SignInRoute> {
            val signInRoute = it.toRoute<SignInRoute>()
            Text(text = "email: ${signInRoute.email} password: ${signInRoute.password}")
        }
        composable<SignUpRoute> {}
    }
}
