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

    var password: String?,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var isSns: Boolean = false,

    var refresh_token: String?,
) : BaseEntityAggregateRoot<User>() {
    init {
        encryptUser()
    }

    private fun encryptUser() {
        // TODO: 암호화 로직 추가
        this.email = email
        this.password = password
        this.name = name
    }
}
