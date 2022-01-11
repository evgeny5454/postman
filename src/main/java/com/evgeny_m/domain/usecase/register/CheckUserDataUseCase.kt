package com.evgeny_m.domain.usecase.register

import com.evgeny_m.domain.models.DomainUserModel
import com.evgeny_m.domain.repository.Firebase

class CheckUserDataUseCase(private val firebaseRegistration: Firebase) {

    fun execute(userId: String){
        firebaseRegistration.foundUserDataById(userId)
    }
}