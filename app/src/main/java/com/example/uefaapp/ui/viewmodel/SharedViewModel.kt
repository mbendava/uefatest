package com.example.uefaapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.uefaapp.di.UefaModule

class SharedViewModel : ViewModel() {

    //  UefaRepository should be provided here when API is available
    val clubData = UefaModule.provideMockRepository().clubData
}