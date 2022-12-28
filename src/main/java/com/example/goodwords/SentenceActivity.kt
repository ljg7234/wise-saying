package com.example.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("늦었다 생각할 때가 진짜 늦었다.")
        sentenceList.add("그대의 하루 하루를 그대의 마지막 날이라고 생각하라.")
        sentenceList.add("삶이 있는 한 희망은 있다 .")
        sentenceList.add("피할수 없으면 즐겨라.")
        sentenceList.add("내일은 내일의 태양이 뜬다.")
        sentenceList.add("고개 숙이지 마십시오. 세상을 똑바로 정면으로 바라보십시오.")


        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}