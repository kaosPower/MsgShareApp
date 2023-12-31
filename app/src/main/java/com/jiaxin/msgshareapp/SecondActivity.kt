package com.jiaxin.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.jiaxin.msgshareapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val bundle: Bundle?=intent.extras
        val msg=bundle!!.getString("user_message")

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

        binding.txvUserMessage.text=msg


    }
}