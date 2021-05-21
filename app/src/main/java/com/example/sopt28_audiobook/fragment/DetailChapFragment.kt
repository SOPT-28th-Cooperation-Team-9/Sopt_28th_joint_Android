package com.example.sopt28_audiobook.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sopt28_audiobook.databinding.FragmentDetailChapBinding

class DetailChapFragment : Fragment() {

    private var _binding: FragmentDetailChapBinding? = null
    private val binding get() = _binding ?: error("View 를 참조하기위해 binding 이 초기화 되지 않았습니다.")

    private lateinit var detailChapAdapter: DetailChapAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailChapBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailChapAdapter = DetailChapAdapter()
        binding.chapterList.adapter = detailChapAdapter
        detailChapAdapter.chapterList.addAll(
            listOf<BookDetailChapter>(
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 02_두 세계",
                    bookTime = "5분·샘플 5분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 02_두 세계",
                    bookTime = "51분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 03_카인",
                    bookTime = "53분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 04_예수 엎에 매달린 도둑",
                    bookTime = "53분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 05_베아트리체",
                    bookTime = "57분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 06_새는알에서 나오려고 투쟁한다",
                    bookTime = "47분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 07_야곱의 싸움",
                    bookTime = "61분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 08_에바 부인",
                    bookTime = "65분"
                ),
                BookDetailChapter(
                    bookImage = "",
                    bookChater = "데미안 09_종말의 시작",
                    bookTime = "23분"
                )
            )
        )

        detailChapAdapter.notifyDataSetChanged()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}