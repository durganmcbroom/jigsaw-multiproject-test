package org.example.api

import java.lang.StringBuilder

class ExampleAPI(private val foo: String) {
    fun foo(): String {
        val builder = StringBuilder()

        var uppercase = false
        for (char in foo.toCharArray()) {
            builder.append(if (uppercase) char.uppercase() else char.lowercase())
            uppercase = !uppercase
        }

        return builder.toString()
    }
}