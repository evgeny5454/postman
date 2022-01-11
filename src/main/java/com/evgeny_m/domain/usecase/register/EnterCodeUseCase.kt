package com.evgeny_m.domain.usecase.register

import com.evgeny_m.domain.repository.Firebase

class EnterCodeUseCase(private val firebaseRegistration: Firebase) {

    fun execute(smsCode: String) {
        firebaseRegistration.enterSmsCode(smsCode)
    }
}