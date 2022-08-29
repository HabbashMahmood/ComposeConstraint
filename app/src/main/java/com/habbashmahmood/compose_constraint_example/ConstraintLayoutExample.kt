package com.habbashmahmood.compose_constraint_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.habbashmahmood.compose_constraint_example.ui.theme.ComposeConstraintExampleAppTheme
import com.habbashmahmood.compose_constraint_example.ui.theme.DarkRed

class ConstraintLayoutExample : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeConstraintExampleAppTheme {
                val systemUiController = rememberSystemUiController()
                if (!isSystemInDarkTheme()) {
                    SideEffect {
                        systemUiController.setStatusBarColor(
                            color = DarkRed,
                            darkIcons = false
                        )
                    }
                }

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MovieBookingScreen()
                }
            }
        }
    }
}

