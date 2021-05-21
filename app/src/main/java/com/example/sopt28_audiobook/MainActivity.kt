package com.example.sopt28_audiobook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.sopt28_audiobook.databinding.ActivityMainBinding
import com.example.sopt28_audiobook.fragment.AudioBookFragment
import com.example.sopt28_audiobook.fragment.HomeFragment
import com.example.sopt28_audiobook.fragment.MyPageFragment
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var viewpagerAdapter : ViewPagerAdapter

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)


        binding.mainBottomNavi.itemIconTintList = null

        //viewpager 세팅
        viewpagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewpagerAdapter.fragments = listOf(
            HomeFragment(),
            AudioBookFragment(),
            MyPageFragment()
        )

        binding.mainViewpager.adapter = viewpagerAdapter

        //bottom navigation 세팅
        binding.mainBottomNavi.setOnNavigationItemSelectedListener {
            var index by Delegates.notNull<Int>()
            when(it.itemId) {
                R.id.home -> index = 0
                R.id.audioBook -> index = 1
                R.id.myPage -> index = 2

            }
            binding.mainViewpager.currentItem = index
            true
        }

        //viewpager slide 시 bottom navi 변경
        binding.mainViewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            //viewpager의 페이지 중 하나가 선택된 경우
            override fun onPageSelected(position: Int) {
                binding.mainBottomNavi.menu.getItem(position).isChecked = true
            }
        })

        setContentView(binding.root)
    }
}