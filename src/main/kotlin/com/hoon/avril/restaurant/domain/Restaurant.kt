package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.common.domain.BaseEntityAggregateRoot
import com.hoon.avril.common.enums.RestaurantType
import jakarta.persistence.*

/**
 * Aggregate Root
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

    var phone: String,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var type: RestaurantType
): BaseEntityAggregateRoot<Restaurant>()

data class RestaurantId(val id: Long)