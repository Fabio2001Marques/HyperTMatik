package com.example.hypertmatik.entities.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.hypertmatik.entities.GameStats
import com.example.hypertmatik.entities.InGameStats
import com.example.hypertmatik.entities.relations.GamesStatsRelation

@Dao
interface GameStatsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertGameStats(gameStats: GameStats)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertInGameStats(inGameStats: InGameStats)

    @Transaction
    @Query("SELECT * FROM gameStatsTable WHERE id = :gameStatsId")
    fun getGameStatsRelationWithGameStatsId(gameStatsId: Int): List<GamesStatsRelation>
}