package com.example.rahulpandeyrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.rahulpandeyrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val contact = createContacts()
        val recyclerView = binding.rvContact


        recyclerView.setBackgroundColor(Color.CYAN)
        recyclerView.adapter = ContactAdapter(this, contact)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    private fun createContacts(): List<Contact> {
        val contacts = mutableListOf<Contact>()
        for (i in 1..150){
            contacts.add(Contact("Person #$i", i))
        }
        return contacts
    }

}