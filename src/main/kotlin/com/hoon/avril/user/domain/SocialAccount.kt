package com.hoon.avril.user.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.common.enums.Provider
import jakarta.persistence.*

@Entity
class SocialAccount (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val provider: Provider,

    @Column(nullable = false)
    val providerId: String
) : BaseEntity()
