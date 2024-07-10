package com.example.lib2

class MultiPrinter {

    fun print(vararg args: String) {
        args.iterator().forEach { println(it) }
    }
}