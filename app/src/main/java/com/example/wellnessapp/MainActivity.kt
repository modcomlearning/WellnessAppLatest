package com.example.wellnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //find Buttons by IDs
        val healthy_recipes = findViewById<Button>(R.id.healthy_recipes)
        healthy_recipes.setOnClickListener{
             val intent = Intent(applicationContext, HealthyRecipes::class.java)
             startActivity(intent)
        }//end

        val nutrition_advice = findViewById<Button>(R.id.nutrition_advice)
        nutrition_advice.setOnClickListener{
            val intent = Intent(applicationContext, NutritionAdvice::class.java)
            startActivity(intent)
        }//end


    }
}