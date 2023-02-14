package com.example.hypertmatik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.hypertmatik.entities.CardsUtils
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.countdown_activity)
        val cardDao = AppDatabase.getInstance(this).cardDao

        val cards = CardsUtils.insertMathCards()

        //val chronometer = findViewById<Chronometer>(R.id.chronometer)

        lifecycleScope.launch {
            cards.forEach { cardDao.insertCard(it) }
        }
    }
}