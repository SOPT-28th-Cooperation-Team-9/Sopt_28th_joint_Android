package com.example.sopt28_audiobook.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt28_audiobook.databinding.ItemSnsBookBinding
import com.example.sopt28_audiobook.databinding.ItemThemeBookBinding

class BookThemeRecyclerAdapter : RecyclerView.Adapter<BookThemeRecyclerAdapter.FollowingUserViewHolder>() {


    lateinit var binding: ItemThemeBookBinding

    val bookList = mutableListOf<SnsBook>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FollowingUserViewHolder {
        binding = ItemThemeBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return FollowingUserViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: FollowingUserViewHolder,
        position: Int
    ) {
        holder.onBind(bookList[position])
    }

    override fun getItemCount(): Int = bookList.size

    class FollowingUserViewHolder(
        private val binding: ItemThemeBookBinding

    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(book: SnsBook) {
            binding.bookTheme.text = book.title

        }
    }


}