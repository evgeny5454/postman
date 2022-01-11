package com.evgeny_m.domain.usecase.settingsfragment

import com.evgeny_m.domain.repository.Firebase

class EditPhotoUseCase(private val firebase: Firebase) {
    fun execute(string: String){
        firebase.editPhoto(string)
    }
}