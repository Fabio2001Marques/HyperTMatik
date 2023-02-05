package com.example.hypertmatik.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.NO_ACTION
import androidx.room.PrimaryKey

@Entity(tableName = "inGameStatsTable")
data class InGameStats(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "score") val score: Int,
    @ColumnInfo(name = "goodAnswer") val goodAnswer: Boolean,
    @ColumnInfo(name = "question") val question: String,
    @ColumnInfo(name = "answer") val answer: String,
    @ColumnInfo(name = "answerSelected") val answerSelected: String,
    @ColumnInfo(name = "letter") val letter: Char,
    @ColumnInfo(name = "answerTime") val answerTime: Int,
    @ColumnInfo(name = "cardId") val cardId: Int,
    @ColumnInfo(name = "gameStatsId") val gameStatsId: Int
)
