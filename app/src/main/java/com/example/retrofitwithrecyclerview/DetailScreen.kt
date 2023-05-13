package com.example.retrofitwithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_screen)

        val Name=findViewById<TextView>(R.id.name)

        val bundle:Bundle?=intent.extras

        val userName=bundle!!.getString("name")

        Name.text=userName

    }
}