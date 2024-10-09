package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.user.domain.User
import jakarta.persistence.*

@Entity
class Comment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id", nullable = false)
    val review: Review,

    var comment: String?,

    @Embedded
    var parentId: CommentId?,
): BaseEntity()

data class CommentId(val id: Long)