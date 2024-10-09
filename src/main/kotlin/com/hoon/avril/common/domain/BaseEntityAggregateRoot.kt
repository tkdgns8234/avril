package com.hoon.avril.common.domain

import jakarta.persistence.EntityListeners
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.domain.AbstractAggregateRoot
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

/**
 * AbstractAggregateRoot 클래스가 자기 제한형 제네릭 형태이기 때문에
 * BaseAgrregateRoot 클래스도 동일하게 제약을 추가해야함.
 * 해당 클래스를 상속받은 클래스만 제네릭 타입으로 올 수 있음
 * */
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntityAggregateRoot<T : BaseEntityAggregateRoot<T>>: AbstractAggregateRoot<T>() {
    @CreatedDate
    val createdAt: LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    val updatedAt: LocalDateTime = LocalDateTime.now()
}