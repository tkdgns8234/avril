package com.hoon.avril.user.domain

import com.hoon.avril.common.domain.BaseEntityAggregateRoot
import jakarta.persistence.*

/**
 * Aggregate Root
 * */

@Entity
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false, unique = true)
    var email: String,

    var password: String,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var isSns: Boolean = false,

    var refresh_token: String,
) : BaseEntityAggregateRoot<User>() {

}

data class UserId(val id: Long)