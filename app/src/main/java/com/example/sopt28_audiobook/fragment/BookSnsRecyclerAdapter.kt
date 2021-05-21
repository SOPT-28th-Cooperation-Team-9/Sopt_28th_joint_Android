package com.example.sopt28_audiobook.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt28_audiobook.databinding.ItemSnsBookBinding

class BookSnsRecyclerAdapter : RecyclerView.Adapter<BookSnsRecyclerAdapter.FollowingUserViewHolder>() {


    lateinit var binding: ItemSnsBookBinding

     val bookList = mutableListOf<SnsBook>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FollowingUserViewHolder {
        binding = ItemSnsBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)

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
        private val binding: ItemSnsBookBinding

    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(book: SnsBook) {
            binding.bookTitle.text = book.title
            binding.bookAuthor.text=book.author
            binding.bookPrice.text=book.price
        }
    }


}