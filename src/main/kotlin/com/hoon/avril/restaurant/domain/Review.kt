package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.user.domain.UserId
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

class Review  (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Embedded
    var restaurantId: RestaurantId,

    @Embedded
    var userId: UserId,

    @Column(nullable = false)
    var score: Double,

    @Column(nullable = false)
    var title: String,

    var content: String,

    var image: ByteArray,

): BaseEntity()

data class ReviewId(val id: Long)