package com.evgeny_m.domain.usecase.contacts

import com.evgeny_m.domain.models.DomainDataContact
import com.evgeny_m.domain.repository.Firebase

class CheckContactsUseCase(private val firebase: Firebase) {
    fun execute(arrayContacts: ArrayList<DomainDataContact>){
        firebase.checkContacts(arrayContacts)
    }
}