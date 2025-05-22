package com.example.getpricebtc.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.example.getpricebtc.Model.Data.BtcPrice
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.getpricebtc.ViewModel.ViewmodelBtC


@Composable
fun Screen1(viewmodelBtC: ViewmodelBtC = viewModel(),paddingValues: PaddingValues){
    val getprice = viewmodelBtC.price.value
    Column {
        if(getprice== null){
            CircularProgressIndicator()
        }
        else {
            Text("${getprice?.price}",)
        }
    }
}