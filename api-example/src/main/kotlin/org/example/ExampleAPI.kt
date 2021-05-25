package org.example

import java.lang.StringBuilder

fun foo(str: String): String {
    val builder = StringBuilder()

    var uppercase = false
    for (char in str.toCharArray()) {
        builder.append(if (uppercase) char.uppercase() else char.lowercase())
    }

    return builder.toString()
}