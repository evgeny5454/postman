package com.evgeny_m.domain.usecase.single_chat

import com.evgeny_m.domain.models.DomainMessageModel
import com.evgeny_m.domain.repository.Firebase
import com.evgeny_m.domain.repository.MessagesRepository

class GetMessagesUseCase(private val firebase: Firebase) {
    fun execute(userId: String)  {
        firebase.getMessagesList(userId)
    }
}