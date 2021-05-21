package com.example.sopt28_audiobook.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sopt28_audiobook.R
import com.example.sopt28_audiobook.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    lateinit var adapter: BookSnsRecyclerAdapter
    lateinit var themeAdapter :BookThemeRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        adapter = BookSnsRecyclerAdapter()

        binding.BookSnsRecyclerView.adapter = adapter
        binding.BookSnsRecyclerView.layoutManager =
            LinearLayoutManager(context).also { it.orientation = LinearLayoutManager.HORIZONTAL }

        adapter.bookList.addAll(
            listOf(SnsBook("어린왕자", "안나영","8000",""),
                SnsBook("신데렐", "야양","2000",""))
        )
        adapter.notifyDataSetChanged()

        // 두번째 리사이클러뷰
        themeAdapter = BookThemeRecyclerAdapter()
        binding.bookThemeRecyclerView.adapter = themeAdapter
        binding.bookThemeRecyclerView.layoutManager =
            LinearLayoutManager(context).also { it.orientation = LinearLayoutManager.HORIZONTAL }

        themeAdapter.bookList.addAll(
            listOf(SnsBook("소설", "안나영","8000",""),
                SnsBook("추리", "야양","2000",""),
                SnsBook("로맨스", "야양","2000",""),
                SnsBook("코믹", "야양","2000",""),
                SnsBook("시집", "야양","2000",""),
                SnsBook("추리", "야양","2000",""))
        )
        themeAdapter.notifyDataSetChanged()





        return binding.root
    }

}