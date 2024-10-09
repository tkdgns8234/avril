package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.user.domain.User
import jakarta.persistence.*

@Entity
class Review  (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    var restaurant: Restaurant,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @Column(nullable = false)
    var score: Double,

    @Column(nullable = false)
    var title: String,

    var content: String?,

    var image: ByteArray?,

): BaseEntity() {
    init {
        isValid()
    }

    private fun isValid() {
        if (score <= 0.0 || score > 5.0) { throw IllegalArgumentException("Invalid score") }
    }
}
