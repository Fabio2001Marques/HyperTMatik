package com.example.hypertmatik

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hypertmatik.entities.Card
import com.example.hypertmatik.entities.GameStats
import com.example.hypertmatik.entities.InGameStats
import com.example.hypertmatik.entities.dao.CardDao

@Database(
    entities = [
        Card::class,
        GameStats::class,
        InGameStats::class
    ],
    version = 2
)
abstract class AppDatabase : RoomDatabase(){

    abstract val cardDao: CardDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase{
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "appDB"
                ).allowMainThreadQueries().build().also {
                    INSTANCE = it
                }
            }
        }
    }
}