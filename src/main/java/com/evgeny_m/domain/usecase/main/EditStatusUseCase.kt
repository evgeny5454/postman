package com.evgeny_m.domain.usecase.main

import com.evgeny_m.domain.repository.Firebase

class EditStatusUseCase(private val firebase: Firebase) {

    fun online(){
        firebase.setOnline()
    }

    fun offline(){
        firebase.setOffline()
    }
}