package com.johnkenedy.pchatapp.ui.feature.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.johnkenedy.pchatapp.R
import com.johnkenedy.pchatapp.ui.theme.PChatAppTheme

//The Route here will deal with the data, viewmodel, and will listen to the states.
@Composable
fun SplashRoute() {

}

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(60.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_safety),
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(8.dp))


            Text(
                text = stringResource(id = R.string.splash_safety_info),
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }

}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFF009688)
fun SplashScreenPreview() {
    PChatAppTheme {
        SplashScreen()
    }
}