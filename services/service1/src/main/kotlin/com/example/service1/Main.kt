package com.example.service1

import com.example.lib1.Printer
import com.example.lib2.MultiPrinter

fun main() {
    val printer = Printer()

    printer.print("hello world")

    val multiPrinter = MultiPrinter()

    multiPrinter.print("hello", "world")
}