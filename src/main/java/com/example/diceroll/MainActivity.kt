package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button as Button1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val rollButton: Button1 = findViewById(R.id.button)
        rollButton.setOnClickListener{
           rollDice()
        }
    }

    private fun rollDice() {
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()
        val resultImageView1: ImageView = findViewById(R.id.imageView)
        val resultImageView2: ImageView = findViewById(R.id.imageView2)

        when(diceRoll1){
            1 -> resultImageView1.setImageResource(R.drawable.dice_1)
            2 -> resultImageView1.setImageResource(R.drawable.dice_2)
            3 -> resultImageView1.setImageResource(R.drawable.dice_3)
            4 -> resultImageView1.setImageResource(R.drawable.dice_4)
            5 -> resultImageView1.setImageResource(R.drawable.dice_5)
            6 -> resultImageView1.setImageResource(R.drawable.dice_6)
        }

        when(diceRoll2){
            1 -> resultImageView2.setImageResource(R.drawable.dice_1)
            2 -> resultImageView2.setImageResource(R.drawable.dice_2)
            3 -> resultImageView2.setImageResource(R.drawable.dice_3)
            4 -> resultImageView2.setImageResource(R.drawable.dice_4)
            5 -> resultImageView2.setImageResource(R.drawable.dice_5)
            6 -> resultImageView2.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(private val numSides : Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}

