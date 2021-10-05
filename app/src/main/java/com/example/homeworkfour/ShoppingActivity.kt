package com.example.homeworkfour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping.*

class Shoppping_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        var email1 = intent.getStringExtra("1")

        currUser.text = email1

        electronics.setOnClickListener(){
            val toast_electronics = Toast.makeText(applicationContext, "You have  chosen the  Electronics  category  of  shopping", Toast.LENGTH_SHORT)
            toast_electronics.show()
        }

        clothes.setOnClickListener(){
            val toast_clothes = Toast.makeText(applicationContext, "You have  chosen the  Clothing  category  of  shopping", Toast.LENGTH_SHORT)
            toast_clothes.show()
        }
        beauty.setOnClickListener(){
            val toast_beauty = Toast.makeText(applicationContext, "You have  chosen the  Beauty  category  of  shopping", Toast.LENGTH_SHORT)
            toast_beauty.show()
        }
        food.setOnClickListener(){
            val toast_food = Toast.makeText(applicationContext, "You have  chosen the  Food  category  of  shopping", Toast.LENGTH_SHORT)
            toast_food.show()
        }
    }

}