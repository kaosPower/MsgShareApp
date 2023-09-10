package com.jiaxin.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle?=intent.extras
        val msg=bundle!!.getString("user_message")

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

        val txvUserMessage=findViewById<TextView>(R.id.txvUserMessage)
        txvUserMessage.text=msg


    }
}