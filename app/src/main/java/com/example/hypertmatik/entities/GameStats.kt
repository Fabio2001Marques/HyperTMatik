package com.example.hypertmatik.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gameStatsTable")
data class GameStats(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "gameDate") val gameDate: String,
    @ColumnInfo(name = "gameTime") val gameTime: Int,
    @ColumnInfo(name = "gameEnd") val gameEnd: Boolean,
    @ColumnInfo(name = "score") val score: Int,
    @ColumnInfo(name = "nCardsGame") val nCardsGame: Int
)
