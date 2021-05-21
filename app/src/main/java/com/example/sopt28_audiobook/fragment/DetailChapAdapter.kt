package com.example.sopt28_audiobook.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt28_audiobook.databinding.ItemBookDetailBinding

class DetailChapAdapter : RecyclerView.Adapter<DetailChapAdapter.DetailChapViewHolder>() {

    val chapterList = mutableListOf<BookDetailChapter>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailChapViewHolder {
        val binding = ItemBookDetailBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return DetailChapViewHolder(
            binding
        )
    }

    override fun getItemCount(): Int = chapterList.size

    override fun onBindViewHolder(holder: DetailChapViewHolder, position: Int) {
        holder.onBind(chapterList[position])
    }

    class DetailChapViewHolder(
        private val binding: ItemBookDetailBinding
        ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(bookDetailChapter: BookDetailChapter) {
            binding.bookDetailItemTvChap.text = bookDetailChapter.bookChater
            binding.bookDetailItemTvMin.text = bookDetailChapter.bookTime
        }
    }
}