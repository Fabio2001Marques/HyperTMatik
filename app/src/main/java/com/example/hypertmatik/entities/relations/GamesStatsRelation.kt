package com.example.hypertmatik.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.hypertmatik.entities.GameStats
import com.example.hypertmatik.entities.InGameStats

data class GamesStatsRelation(
    @Embedded val gameStats: GameStats,
    @Relation(
        parentColumn = "id",
        entityColumn = "gameStatsId"
    )
    val inGameStats: List<InGameStats>
)
