package com.hoon.avril

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * aggregate root 단위로 패키지 구성
 * */

@SpringBootApplication
class AvrilApplication

fun main(args: Array<String>) {
    runApplication<AvrilApplication>(*args)
}
