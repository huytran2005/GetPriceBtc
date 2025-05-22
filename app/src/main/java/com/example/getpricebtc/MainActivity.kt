package com.example.getpricebtc

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.getpricebtc.View.Screen1
import com.example.getpricebtc.ViewModel.ViewmodelBtC
import com.example.getpricebtc.ui.theme.GetPriceBtcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
            GetPriceBtcTheme{
            Scaffold(modifier = Modifier
                .fillMaxSize()
                .padding(20.dp).background(color = Color.White)) { innerPadding ->
                Screen1(paddingValues = innerPadding)
                }
            }
        }
    }
}
