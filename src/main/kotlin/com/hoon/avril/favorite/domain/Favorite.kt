package com.hoon.avril.favorite.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.restaurant.domain.RestaurantId
import com.hoon.avril.user.domain.UserId
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


/**
 * Aggregate Root
 * */

@Entity
class Favorite (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var userId: UserId,

    var restaurantId: RestaurantId,

    val isDeleted: Boolean = false
): BaseEntity()