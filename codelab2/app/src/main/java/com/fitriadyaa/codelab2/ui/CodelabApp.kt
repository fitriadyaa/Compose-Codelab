package com.fitriadyaa.codelab2.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.fitriadyaa.codelab2.ui.navigation.BottomNavigationBar
import com.fitriadyaa.codelab2.ui.screen.HomeScreen
import com.fitriadyaa.codelab2.ui.theme.Codelab2Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CodelabApp() {
    Scaffold(
        bottomBar = { BottomNavigationBar()}
    ) { padding ->
        HomeScreen(Modifier.padding(padding))
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun CodelabAppPreview(){
    Codelab2Theme {
        CodelabApp()
    }
}
