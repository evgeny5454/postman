package com.evgeny_m.data.repository

import androidx.lifecycle.LiveData

interface DataRepository {
    
    fun getUserId(): LiveData<String>

}