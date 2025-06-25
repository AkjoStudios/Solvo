package com.akjostudios.solvo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SolvoApplication

fun main(args: Array<String>) {
    runApplication<SolvoApplication>(*args)
}