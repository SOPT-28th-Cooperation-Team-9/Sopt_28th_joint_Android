package com.example.sopt28_audiobook.discountBook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt28_audiobook.databinding.ItemDiscountBookBinding

class DiscountBookAdapter: RecyclerView.Adapter<DiscountBookAdapter.DiscountBookViewHolder>() {

    val discountBookList = mutableListOf<DiscountBookData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountBookViewHolder {

        val binding = ItemDiscountBookBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return DiscountBookViewHolder(binding)
    }

    override fun getItemCount(): Int = discountBookList.size

    override fun onBindViewHolder(holder: DiscountBookViewHolder, position: Int) {
        holder.onBind(discountBookList[position])
    }

    class DiscountBookViewHolder(
        private val binding: ItemDiscountBookBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(discountBookData: DiscountBookData) {
//            binding.ivAudioBookBookCover.setImageDrawable(discountBookData.imageviewBookCover)
            binding.tvAudioBookDuration.text = discountBookData.textviewBookDuration
            binding.tvAudioBookBookTitle.text = discountBookData.textviewBookTitle
            binding.tvAudioBookBookPeople.text = discountBookData.textviewBookPeople
            binding.tvAudioBookBookPrice.text = discountBookData.textviewBookPrice
        }
    }
}