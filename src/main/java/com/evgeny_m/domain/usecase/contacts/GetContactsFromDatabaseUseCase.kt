package com.evgeny_m.domain.usecase.contacts

import com.evgeny_m.domain.models.DomainDataContact
import com.evgeny_m.domain.repository.Firebase

class GetContactsFromDatabaseUseCase(private val firebase: Firebase) {

    fun execute(): List<DomainDataContact>{
        //return firebase.getContacts()
        return emptyList()
    }
}