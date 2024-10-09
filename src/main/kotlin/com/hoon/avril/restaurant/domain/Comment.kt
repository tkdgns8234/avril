package com.hoon.avril.restaurant.domain

import com.hoon.avril.common.domain.BaseEntity
import com.hoon.avril.user.domain.UserId
import jakarta.persistence.Embedded
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

class Comment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Embedded
    var userId: UserId,

    @Embedded
    var reviewId: ReviewId,

    var comment: String,

    var parentId: CommentId,
): BaseEntity()

data class CommentId(val id: Long)