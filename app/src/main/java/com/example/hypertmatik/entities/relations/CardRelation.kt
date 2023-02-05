package com.example.hypertmatik.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.hypertmatik.entities.Card
import com.example.hypertmatik.entities.InGameStats

data class CardRelation(
    @Embedded val card: Card,
    @Relation(
        parentColumn = "id",
        entityColumn = "cardId"
    )
    val inGameStats: List<InGameStats>
)
