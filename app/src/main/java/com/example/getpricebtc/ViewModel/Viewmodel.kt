package com.example.getpricebtc.ViewModel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getpricebtc.Model.Api.RetrofitClient
import com.example.getpricebtc.Model.Data.BtcPrice
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class ViewmodelBtC : ViewModel() {
    private val _price = mutableStateOf<BtcPrice?>(null)
    val price: State<BtcPrice?> = _price

    init {
        FeatchData()
    }

    fun FeatchData() {
            viewModelScope.launch {
                while (true) {
                    try {
                        _price.value = RetrofitClient.api.getPrice()
                        println("Tôi bị rảnh : ${price.value}")
                        delay(1000)
                        }
                    catch (e: Exception){
                        //Lỗi
                    }
                }
            }
        }

}
