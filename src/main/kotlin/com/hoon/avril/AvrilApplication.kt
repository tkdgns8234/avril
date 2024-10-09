package com.hoon.avril

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

/**
 * aggregate root 단위로 패키지 구성
 * */

@EnableJpaAuditing
@SpringBootApplication
class AvrilApplication

fun main(args: Array<String>) {
    runApplication<AvrilApplication>(*args)
}
