package com.example.hypertmatik.entities.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.hypertmatik.entities.Card
import com.example.hypertmatik.entities.InGameStats
import com.example.hypertmatik.entities.relations.CardRelation
import com.example.hypertmatik.entities.relations.GamesStatsRelation

@Dao
interface CardDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun insertCard(card: Card)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun insertInGameStats(inGameStats: InGameStats)

    @Update
     fun updateCard(card: Card)

    @Delete
     fun deleteCard(card: Card)

    @Transaction
    @Query("SELECT * FROM cardTable WHERE type = :gameType")
    fun getAllCardsByType(gameType: String): LiveData<List<Card>>

    @Transaction
    @Query("SELECT * FROM cardTable WHERE id = :cardId")
    fun getCardRelationWithCardId(cardId: Int): LiveData<List<CardRelation>>

}