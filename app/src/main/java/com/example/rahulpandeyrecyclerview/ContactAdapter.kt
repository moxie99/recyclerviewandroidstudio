package com.example.rahulpandeyrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ContactAdapter(
    private val context: Context,
    private val contacts: List<Contact>
): RecyclerView.Adapter<ContactAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.contact, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int = contacts.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(contact: Contact) {
            itemView.findViewById<TextView>(R.id.tvname).text = contact.name
            itemView.findViewById<TextView>(R.id.tvAge).text = contact.age.toString()
            Glide.with(context).load(contact.imageUrl).into(itemView.findViewById(R.id.ivAvatar))
        }
    }

}