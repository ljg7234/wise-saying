package com.example.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("늦었다 생각할 때가 진짜 늦었다.")
        sentenceList.add("그대의 하루 하루를 그대의 마지막 날이라고 생각하라.")
        sentenceList.add("삶이 있는 한 희망은 있다 .")
        sentenceList.add("피할수 없으면 즐겨라.")
        sentenceList.add("내일은 내일의 태양이 뜬다.")
        sentenceList.add("고개 숙이지 마십시오. 세상을 똑바로 정면으로 바라보십시오.")


        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this,SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}