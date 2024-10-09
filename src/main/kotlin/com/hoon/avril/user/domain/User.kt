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

    @OneToMany(mappedBy = "user")
    val socialAccount: MutableList<SocialAccount> = mutableListOf(),

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
        isValid()
        encryptData()
    }

    private fun isValid() {
        // TODO: email, password, name 데이터 검증
    }

    private fun encryptData() {
        // TODO: 데이터 암호화
    }

    private fun addSocialAccount(socialAccount: SocialAccount) {
        this.socialAccount.add(socialAccount)
    }
}
