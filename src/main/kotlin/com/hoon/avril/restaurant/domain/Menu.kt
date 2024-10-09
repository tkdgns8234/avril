package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
class Menu (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Embedded
    var restaurantId: RestaurantId,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var price: Double,

    var image: ByteArray,

): BaseEntity()