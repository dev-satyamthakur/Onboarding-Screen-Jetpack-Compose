package com.satyamthakur.learning.onboardingscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.satyamthakur.learning.onboardingscreen.data.OnboardingData
import com.satyamthakur.learning.onboardingscreen.data.PagerScreen
import com.satyamthakur.learning.onboardingscreen.ui.theme.OnboardingScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnboardingScreenTheme {
                Surface {
                    OnboardingMainScreen()
                }
            }
        }
    }
}

@Composable
fun OnboardingMainScreen() {
    val mylist = listOf(
        OnboardingData(
            image = R.drawable.saly_01,
            title = "Title 1",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        ),
        OnboardingData(
            image = R.drawable.saly_02,
            title = "Title 2",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        ),
        OnboardingData(
            image = R.drawable.saly_03,
            title = "Title 3",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        )
    )
    PagerScreen(items = mylist)
}
