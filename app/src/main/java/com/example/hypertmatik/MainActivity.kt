package com.example.hypertmatik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.hypertmatik.entities.Card
import com.example.hypertmatik.entities.CardsUtils
import kotlinx.coroutines.launch

import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardDao = AppDatabase.getInstance(this).cardDao

        val cards = CardsUtils.insertMathCards()

        lifecycleScope.launch {
            cards.forEach { cardDao.insertCard(it) }
        }
    }
}