@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.sunflower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sunflower.ui.screens.FunFactsNav
import com.example.sunflower.ui.screens.Routers
import com.example.sunflower.ui.screens.UserInputScreen
import com.example.sunflower.ui.screens.WelcomeScreen
import com.example.sunflower.ui.theme.SunflowerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunflowerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FunFactsApp()
                }
            }
        }
    }

    @Composable
    fun FunFactsApp() {
        FunFactsNav()
    }
}
