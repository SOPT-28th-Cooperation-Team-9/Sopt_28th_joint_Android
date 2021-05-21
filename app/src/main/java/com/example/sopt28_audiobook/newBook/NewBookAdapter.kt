package com.example.sopt28_audiobook.newBook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt28_audiobook.databinding.ItemNewBookBinding

class NewBookAdapter : RecyclerView.Adapter<NewBookAdapter.NewBookViewHolder>(){

    val newBookList = mutableListOf<NewBookData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewBookViewHolder {

        val binding = ItemNewBookBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return NewBookViewHolder(binding)
    }

    override fun getItemCount(): Int = newBookList.size

    override fun onBindViewHolder(holder: NewBookViewHolder, position: Int) {
        holder.onBind(newBookList[position])
    }

    class NewBookViewHolder(
        private val binding: ItemNewBookBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(newBookData: NewBookData) {
//            binding.ivAudioBookNewBookCover
            binding.tvAudioBookNewBookDuration.text = newBookData.textviewNewBookDuration
            binding.tvAudioBookNewBookTitle.text = newBookData.textviewNewBookTitle
            binding.tvAudioBookNewBookPeople.text = newBookData.textviewNewBookPeople
            binding.tvAudioBookNewBookPrice.text = newBookData.textviewNewBookPrice
        }
    }

}