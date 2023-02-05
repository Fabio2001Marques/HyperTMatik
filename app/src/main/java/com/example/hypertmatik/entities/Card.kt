package com.example.hypertmatik.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cardTable")
data class Card(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "letter") val letter: Char,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "level") val level: String?,
    @ColumnInfo(name = "questionA") val questionA: String,
    @ColumnInfo(name = "questionB") val questionB: String,
    @ColumnInfo(name = "questionC") val questionC: String,
    @ColumnInfo(name = "questionD") val questionD: String,
    @ColumnInfo(name = "questionE") val questionE: String?,
    @ColumnInfo(name = "questionF") val questionF: String?,
    @ColumnInfo(name = "questionG") val questionG: String?,
    @ColumnInfo(name = "questionH") val questionH: String?,
    @ColumnInfo(name = "questionI") val questionI: String?,
    @ColumnInfo(name = "questionJ") val questionJ: String?,
    @ColumnInfo(name = "answerA") val answerA: String,
    @ColumnInfo(name = "answerB") val answerB: String,
    @ColumnInfo(name = "answerC") val answerC: String,
    @ColumnInfo(name = "answerD") val answerD: String,
    @ColumnInfo(name = "answerE") val answerE: String?,
    @ColumnInfo(name = "answerF") val answerF: String?,
    @ColumnInfo(name = "answerG") val answerG: String?,
    @ColumnInfo(name = "answerH") val answerH: String?,
    @ColumnInfo(name = "answerI") val answerI: String?,
    @ColumnInfo(name = "answerJ") val answerJ: String?
)
