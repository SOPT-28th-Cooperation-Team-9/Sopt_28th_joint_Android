package com.example.sopt28_audiobook.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import com.example.sopt28_audiobook.R
import com.example.sopt28_audiobook.databinding.FragmentAudioBookBinding
import com.example.sopt28_audiobook.discountBook.DiscountBookAdapter
import com.example.sopt28_audiobook.discountBook.DiscountBookData
import com.example.sopt28_audiobook.newBook.NewBookAdapter
import com.example.sopt28_audiobook.newBook.NewBookData
import android.graphics.drawable.Drawable


class AudioBookFragment : Fragment() {

    private var _binding: FragmentAudioBookBinding?= null
    private val binding get() = _binding?:error("View를 참조하기 위해 binding이 초기화되지 않았습니다.")
    private lateinit var discountBookAdapter: DiscountBookAdapter
    private lateinit var newBookAdapter: NewBookAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentAudioBookBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 민음사 세계문학 10권 70% 할인
        discountBookAdapter = DiscountBookAdapter()

        binding.discountBookList.adapter = discountBookAdapter

        discountBookAdapter.discountBookList.addAll(
            listOf<DiscountBookData>(
                DiscountBookData(
                    imageviewBookCover = "@drawable/@drawable/rectangle_1070",
                    textviewBookDuration = "6시간 59분",
                    textviewBookTitle = "데미안 (민음사 세계문학, 완독분)",
                    textviewBookPeople = "헤르만헤세 저 최승훈 외 1인 낭독",
                    textviewBookPrice = "대여 2,700원"
                ),
                DiscountBookData(
                    imageviewBookCover = "@drawable/@drawable/rectangle_1070",
                    textviewBookDuration = "6시간 59분",
                    textviewBookTitle = "페스트 (민음사 세계문학, 완독분)",
                    textviewBookPeople = "알베르 카뮈 저 최승훈 외 1인 낭독",
                    textviewBookPrice = "대여 2,700원"
                ),
                DiscountBookData(
                    imageviewBookCover = "@drawable/@drawable/rectangle_1070",
                    textviewBookDuration = "6시간 59분",
                    textviewBookTitle = "1984 (민음사 세계문학, 완독분)",
                    textviewBookPeople = "조지 오웰 저 최승훈 외 1인 낭독",
                    textviewBookPrice = "대여 2,700원"
                ),
                DiscountBookData(
                    imageviewBookCover = "@drawable/@drawable/rectangle_1070",
                    textviewBookDuration = "6시간 59분",
                    textviewBookTitle = "페스트 (민음사 세계문학, 완독분)",
                    textviewBookPeople = "알베르 카뮈 저 최승훈 외 1인 낭독",
                    textviewBookPrice = "대여 2,700원"
                ),
                DiscountBookData(
                    imageviewBookCover = "@drawable/@drawable/rectangle_1070",
                    textviewBookDuration = "6시간 59분",
                    textviewBookTitle = "1984 (민음사 세계문학, 완독분)",
                    textviewBookPeople = "조지 오웰 저 최승훈 외 1인 낭독",
                    textviewBookPrice = "대여 2,700원"
                )
                ,
                DiscountBookData(
                    imageviewBookCover = "@drawable/@drawable/rectangle_1070",
                    textviewBookDuration = "6시간 59분",
                    textviewBookTitle = "1984 (민음사 세계문학, 완독분)",
                    textviewBookPeople = "조지 오웰 저 최승훈 외 1인 낭독",
                    textviewBookPrice = "대여 2,700원"
                )
                ,
                DiscountBookData(
                    imageviewBookCover = "@drawable/@drawable/rectangle_1070",
                    textviewBookDuration = "6시간 59분",
                    textviewBookTitle = "1984 (민음사 세계문학, 완독분)",
                    textviewBookPeople = "조지 오웰 저 최승훈 외 1인 낭독",
                    textviewBookPrice = "대여 2,700원"
                )
            )
        )
        discountBookAdapter.notifyDataSetChanged()

        // 새로나온 시집
        newBookAdapter = NewBookAdapter()

        binding.newBookList.adapter = newBookAdapter

        newBookAdapter.newBookList.addAll(
            listOf<NewBookData>(
                NewBookData(
                    imageviewNewBookCover = "@drawable/@drawable/rectangle_1071",
                    textviewNewBookDuration = "6시간 59분",
                    textviewNewBookTitle = "내 아이를 위한 목소리 태교",
                    textviewNewBookPeople = "박용범 저 김나연 낭독",
                    textviewNewBookPrice = "대여 5,000원"
                ),
                NewBookData(
                    imageviewNewBookCover = "@drawable/@drawable/rectangle_1071",
                    textviewNewBookDuration = "6시간 59분",
                    textviewNewBookTitle = "8자를 잡다 조현숙 수필집",
                    textviewNewBookPeople = "조현숙 저 김미자 낭독",
                    textviewNewBookPrice = "대여 3,500원"
                ),
                NewBookData(
                    imageviewNewBookCover = "@drawable/@drawable/rectangle_1071",
                    textviewNewBookDuration = "6시간 59분",
                    textviewNewBookTitle = "그런 사람 또 없습니다",
                    textviewNewBookPeople = "김민정 저 향기 낭독",
                    textviewNewBookPrice = "대여 2,850원"
                ),
                NewBookData(
                    imageviewNewBookCover = "@drawable/@drawable/rectangle_1071",
                    textviewNewBookDuration = "6시간 59분",
                    textviewNewBookTitle = "내 아이를 위한 목소리 태교",
                    textviewNewBookPeople = "박용범 저 김나연 낭독",
                    textviewNewBookPrice = "대여 5,000원"
                ),
                NewBookData(
                    imageviewNewBookCover = "@drawable/@drawable/rectangle_1071",
                    textviewNewBookDuration = "6시간 59분",
                    textviewNewBookTitle = "내 아이를 위한 목소리 태교",
                    textviewNewBookPeople = "박용범 저 김나연 낭독",
                    textviewNewBookPrice = "대여 5,000원"
                ),
                NewBookData(
                    imageviewNewBookCover = "@drawable/@drawable/rectangle_1071",
                    textviewNewBookDuration = "6시간 59분",
                    textviewNewBookTitle = "내 아이를 위한 목소리 태교",
                    textviewNewBookPeople = "박용범 저 김나연 낭독",
                    textviewNewBookPrice = "대여 5,000원"
                ),
                NewBookData(
                    imageviewNewBookCover = "@drawable/@drawable/rectangle_1071",
                    textviewNewBookDuration = "6시간 59분",
                    textviewNewBookTitle = "내 아이를 위한 목소리 태교",
                    textviewNewBookPeople = "박용범 저 김나연 낭독",
                    textviewNewBookPrice = "대여 5,000원"
                )
            )
        )
        newBookAdapter.notifyDataSetChanged()
    }
}