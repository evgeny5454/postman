package com.evgeny_m.data.registration

import android.app.Activity
import android.app.Application
import android.content.Context

abstract class FirebaseDatabase()  {

    //abstract fun database(): FirebaseRegistrationImpl

    companion object {

        private var INSTANCE : FirebaseRegistrationImpl? = null

        fun getDatabase(application: Application) : FirebaseRegistrationImpl {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = FirebaseRegistrationImpl(application)
                INSTANCE = instance
                return instance
            }
        }
    }
}