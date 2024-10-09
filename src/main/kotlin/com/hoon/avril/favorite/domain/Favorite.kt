package com.hoon.avril.favorite.domain

import com.hoon.avril.common.domain.BaseEntityAggregateRoot
import com.hoon.avril.restaurant.domain.Restaurant
import com.hoon.avril.user.domain.User
import jakarta.persistence.*


/**
 * Aggregate Root
 * */

@Entity
class Favorite (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    val restaurant: Restaurant,

    val isDeleted: Boolean = false
): BaseEntityAggregateRoot<Favorite>()