package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntityAggregateRoot
import com.hoon.avril.common.enums.RestaurantType
import jakarta.persistence.*

/**
 * Aggregate Root
 * TODO: onetoMany 참조 추가, 도메인 로직 추가
 * */
@Entity
class Restaurant (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var address: String,

    @Column(nullable = false)
    var name: String,

    var phone: String?,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var type: RestaurantType
): BaseEntityAggregateRoot<Restaurant>() {
    init {
        isValid()
    }

    private fun isValid() {
        if (name.isEmpty()) { throw IllegalArgumentException("Name cannot be empty") }
    }
}
