package com.evgeny_m.domain.usecase.settingsfragment

import com.evgeny_m.domain.repository.Firebase

class EditUserNameUseCase(private val firebase: Firebase) {
    fun execute(string: String){
        firebase.editUserName(string = string)
    }
}