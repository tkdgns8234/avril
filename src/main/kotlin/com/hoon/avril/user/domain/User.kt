package com.hoon.avril.user.domain

import com.hoon.avril.common.domain.BaseEntity
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
    val email: String,

    val password: String,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val isSns: Boolean = false,

    val refresh_token: String,
) : BaseEntity()

data class UserId(val id: Long)