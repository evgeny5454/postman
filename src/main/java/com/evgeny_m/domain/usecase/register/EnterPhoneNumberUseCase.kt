package com.evgeny_m.domain.usecase.register

import com.evgeny_m.domain.repository.Firebase

class EnterPhoneNumberUseCase(private val firebaseRegistration: Firebase) {

    fun execute(phoneNumber: String) {
        firebaseRegistration.registerUserByPhoneNumber(phoneNumber)
    }
/*    fun enterSmsCode(code: String) {
        firebaseRegistration.enterSmsCode(code)
    }*/
    /*fun logOut(){
        firebaseRegistration.logOut()
    }*/
}