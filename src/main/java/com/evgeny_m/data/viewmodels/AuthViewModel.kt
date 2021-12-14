package com.evgeny_m.data.viewmodels

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.evgeny_m.data.models.User
import com.evgeny_m.data.registration.FirebaseDatabase
import com.evgeny_m.data.repository.DataRepository
import com.evgeny_m.data.repository.UserRepository
import com.evgeny_m.data.room.UserDatabase
import com.evgeny_m.domain.repository.FirebaseRegistration

class AuthViewModel(application: Application) : AndroidViewModel(application) {

    val userId: LiveData<String> = FirebaseDatabase.getDatabase(application).getUserId()
}