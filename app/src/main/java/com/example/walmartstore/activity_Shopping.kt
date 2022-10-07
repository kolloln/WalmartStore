package com.example.walmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shopping.*

class activity_Shopping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        electronics.setOnClickListener {
            var intent = Intent(this,activity_createaccount::class.java)
            startActivity(intent);

        }
    }
}