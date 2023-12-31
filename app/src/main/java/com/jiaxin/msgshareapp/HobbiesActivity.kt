package com.jiaxin.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jiaxin.msgshareapp.databinding.ActivityHobbiesBinding

class HobbiesActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHobbiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHobbiesBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL
        binding.recyclerView.layoutManager=layoutManager


        val adapter=HobbiesAdapter(this,Supplier.hobbies)
        binding.recyclerView.adapter=adapter
    }
}