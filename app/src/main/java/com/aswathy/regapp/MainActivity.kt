package com.aswathy.regapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mybtnclick(view: View) {

        var getPassword=findViewById<EditText>(R.id.pass);
        var getEmail=findViewById<EditText>(R.id.ema);



Toast.makeText(this,getPassword.text.toString(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,getEmail.text.toString(),Toast.LENGTH_LONG).show();



    }

    fun Register(view: View) {

   intent=Intent(this,userActivity::class.java);
  startActivity(intent);

    }

}