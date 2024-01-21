package com.example.kotlin_todos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTodosApplication

fun main(args: Array<String>) {
    runApplication<KotlinTodosApplication>(*args)
}
