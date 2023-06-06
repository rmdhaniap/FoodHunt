package com.example.foodhunt.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodhunt.model.UserModel
import com.example.foodhunt.model.UserPreference
import kotlinx.coroutines.launch

class RegisterViewModel(private val pref: UserPreference) : ViewModel() {
    fun saveUser(user: UserModel) {
        viewModelScope.launch {
            pref.saveUser(user)
        }
    }
}