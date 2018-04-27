package com.ranimuli.stringutillibrary

object StringUtil {

    fun emailValidate(email: String): Boolean {
        return !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

}