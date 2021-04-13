package com.example.dice

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //start of my coding part
val btn:Button=findViewById(R.id.btn)
        btn.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            val text:TextView=findViewById(R.id.displayNum)
            val num=(1..6).random()
            text.text="$num"
            val image:ImageView=findViewById(R.id.img)
            when(num){
                1-> image.setImageResource(R.drawable.dice_1)
                2->image.setImageResource(R.drawable.dice_2)
                3->image.setImageResource(R.drawable.dice_3)
                4->image.setImageResource(R.drawable.dice_4)
                5->image.setImageResource(R.drawable.dice_5)
                6->image.setImageResource(R.drawable.dice_6)
                else->image.setImageResource(R.drawable.dice_1)
            }
        }
        //End of my coding part
    }
}