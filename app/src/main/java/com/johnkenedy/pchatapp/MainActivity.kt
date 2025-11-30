package com.johnkenedy.pchatapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.johnkenedy.pchatapp.ui.theme.PChatAppTheme

/**

 Hello everyone and welcome back, in this playlist Let's create a complete Chat app
 while I go through Jetpack Compose, MVI architecture, dependency Injection with Hilt,
 Firebase for authentication, dataStore, repository pattern, and much more.

 I`ll not just build and give you a superficial idea,
 we gonna take our time, explain everything, why we use and choose any component or take any decision.
 Let's get started so you can see whats the idea, and how it's gonna work.

 First Let`s create some packages here, one for navigation, which we will cover in the next video,
 and here in the UI lets create one called feature. Here in the ui package lets create a
 ChatApp.kt file.



 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PChatAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PChatAppTheme {
        Greeting("Android")
    }
}