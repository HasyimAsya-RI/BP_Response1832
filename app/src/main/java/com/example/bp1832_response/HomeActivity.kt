package com.example.bp1832_response

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_home )

//        val button: Button = findViewById( R.id.imageView_Menu2 )
//        button.setOnClickListener {
//            val intent = Intent( this, Activity::class.java )
//            startActivity( intent )
//        }
//
//        val button: Button = findViewById( R.id.imageView_Menu3 )
//        button.setOnClickListener {
//            val intent = Intent( this, Activity::class.java )
//            startActivity( intent )
//        }
//
//        val button: Button = findViewById( R.id.imageView_Menu4 )
//        button.setOnClickListener {
//            val intent = Intent( this, Activity::class.java )
//            startActivity( intent )
//        }
    }
}