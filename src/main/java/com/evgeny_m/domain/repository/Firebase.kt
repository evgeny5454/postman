package com.evgeny_m.domain.repository

import com.evgeny_m.domain.models.DomainDataContact

interface Firebase {

    fun registerUserByPhoneNumber(phoneNumber: String)
    fun enterSmsCode(code: String)
    fun logOut()
    fun editFullName(firstName: String, lastName: String)
    fun editBio(string: String)
    fun editUserName(string: String)
    fun editPhone(string: String)
    fun editPhoto(string: String)
    fun checkUserName(string: String)
    fun setOnline()
    fun setOffline()
    fun foundUserDataById(userId: String)
    fun checkContacts(array: ArrayList<DomainDataContact>)
    //fun getContacts() : List<DomainDataContact>
    //fun getUserData(list :List<DomainDataContact>)

}