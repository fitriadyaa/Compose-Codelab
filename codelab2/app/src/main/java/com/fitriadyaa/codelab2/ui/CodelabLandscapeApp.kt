package com.fitriadyaa.codelab2.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.fitriadyaa.codelab2.ui.navigation.WhenNavigationRail
import com.fitriadyaa.codelab2.ui.screen.HomeScreen
import com.fitriadyaa.codelab2.ui.theme.Codelab2Theme

@Composable
fun CodelabLandscapeApp(){
    Codelab2Theme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                WhenNavigationRail()
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun CodelabLandscapePreview(){
    CodelabLandscapeApp()
}