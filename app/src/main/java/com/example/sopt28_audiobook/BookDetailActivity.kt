package com.example.sopt28_audiobook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sopt28_audiobook.databinding.ActivityBookDetailBinding
import com.example.sopt28_audiobook.fragment.*

class BookDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookDetailBinding

    private lateinit var viewpagerAdapter : DetailViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bookDetailBtnBack.setOnClickListener{ onBackPressed() }

        //viewpager
        viewpagerAdapter = DetailViewPagerAdapter(supportFragmentManager)
        viewpagerAdapter.fragments = listOf(
            DetailChapFragment(),
            DetailCommentFragment(),
            DetailInfoFragment()
        )

        binding.bookDetailViewpager.adapter = viewpagerAdapter

        //tablayout
        binding.bookDetailTabLayout.setupWithViewPager(binding.bookDetailViewpager)
        binding.bookDetailTabLayout.apply {
            getTabAt(0)?.text = "챕터 9"
            getTabAt(1)?.text = "댓글 64"
            getTabAt(2)?.text = "북 정보"
        }

    }
}