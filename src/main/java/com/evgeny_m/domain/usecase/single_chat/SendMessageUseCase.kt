package com.evgeny_m.domain.usecase.single_chat

import com.evgeny_m.domain.repository.Firebase
import com.evgeny_m.domain.repository.MessagesRepository

class SendMessageUseCase(private val firebase: Firebase) {

    fun execute(message: String, userId: String) {
        firebase.sendMessage(message, userId)
    }
}