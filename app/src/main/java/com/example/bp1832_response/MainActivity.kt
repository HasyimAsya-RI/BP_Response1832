package com.example.bp1832_response

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        val button: Button = findViewById( R.id.button_Start )
        button.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }
    }
}