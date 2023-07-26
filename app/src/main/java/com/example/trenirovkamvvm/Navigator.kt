package com.example.trenirovkamvvm

import com.example.trenirovkamvvm.model.User

interface Navigator {

    fun showDetails(user: User)

    fun goBack()

    fun toast(messageRes: Int)

}