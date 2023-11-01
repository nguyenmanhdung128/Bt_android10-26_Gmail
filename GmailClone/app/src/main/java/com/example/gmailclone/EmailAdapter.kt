package com.example.gmailclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<EmailItem>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        val contentTextView: TextView = itemView.findViewById(R.id.textViewContent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return EmailViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val currentItem = emailList[position]
        holder.titleTextView.text = currentItem.title
        holder.contentTextView.text = currentItem.content
    }

    override fun getItemCount() = emailList.size
}