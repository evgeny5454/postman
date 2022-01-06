package com.evgeny_m.domain.usecase.settingsfragment

import com.evgeny_m.domain.repository.Firebase

class LogOutUseCase(private val firebase: Firebase) {
    fun logOut(){
        firebase.logOut()
    }
}