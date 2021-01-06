package com.aswathy.regapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class userActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
    }

    fun mybtnnclick(view: View) {

        var getName=findViewById<EditText>(R.id.na);
        var getPlace=findViewById<EditText>(R.id.pla);
        var getPhoneNo=findViewById<EditText>(R.id.pho);
        var getEmailid=findViewById<EditText>(R.id.ema);
        var getPassword=findViewById<EditText>(R.id.pass);
        var getConfirmPassword=findViewById<EditText>(R.id.con);



        Toast.makeText(this,getName.text.toString(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,getEmailid.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPlace.text.toString() + getName.text.toString(),Toast.LENGTH_LONG).show();


    }


    fun backtologin(view: View) {
        intent=Intent(this,MainActivity::class.java);
        startActivity(intent);
    }


}



