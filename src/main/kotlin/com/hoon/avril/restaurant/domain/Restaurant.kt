package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

/**
 * Aggregate Root
 * */
class Restaurant (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var address: String,

    @Column(nullable = false)
    var name: String,

    var phone: String,

    // TODO 맛집 유형 코드단 Enum 관리? 필요
    var type: String
): BaseEntity()

data class RestaurantId(val id: Long)