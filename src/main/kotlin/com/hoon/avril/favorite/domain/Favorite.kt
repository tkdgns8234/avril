package com.hoon.avril.favorite.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.common.domain.BaseEntityAggregateRoot
import com.hoon.avril.restaurant.domain.RestaurantId
import com.hoon.avril.user.domain.UserId
import jakarta.persistence.*


/**
 * Aggregate Root
 * */

@Entity
class Favorite (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Embedded
    var userId: UserId,

    @Embedded
    var restaurantId: RestaurantId,

    val isDeleted: Boolean = false
): BaseEntityAggregateRoot<Favorite>()