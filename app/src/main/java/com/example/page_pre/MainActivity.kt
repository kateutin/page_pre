package com.example.page_pre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 내용 채워 넣기 - 이미지뷰랑 텍스트 뷰 사용 레이아웃은... 리니어? co~ 아직 익숙 X 리니어로
        //2. 리스트뷰 or 리싸이클러뷰 생성하기 - 둘 다 어댑터 있어야 함 스크롤 기능은 re- 가 더 편할 수도 있음
        //3. 메인 Act 에는 뭐가 필요한지 모름 일단 더 찾아 볼것
        // SpannableString 기능으로 글자 변경 할 수 있다는데 gg..

    }
}