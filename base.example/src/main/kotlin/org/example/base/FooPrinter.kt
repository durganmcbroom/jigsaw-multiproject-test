package org.example.base

import org.example.api.ExampleAPI

class FooPrinter(private val toPrint: String) {
    fun doFoo() {
        println(ExampleAPI(toPrint).foo())
    }
}