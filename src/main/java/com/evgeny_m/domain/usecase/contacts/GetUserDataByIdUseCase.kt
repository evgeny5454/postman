package com.evgeny_m.domain.usecase.contacts

import com.evgeny_m.domain.models.DomainDataContact
import com.evgeny_m.domain.repository.Firebase

class GetUserDataByIdUseCase(private val firebase: Firebase) {

    fun execute(list : List<DomainDataContact>){
         //firebase.getUserData(list)
    }
}