package com.example.talkssogi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.talkssogi.Page1Activity
import com.example.talkssogi.Page3Activity
import com.example.talkssogi.Page8Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Page1Activity로 이동하는 버튼 설정
        val buttonOpenPage1 = findViewById<Button>(R.id.button_open_page1)
        buttonOpenPage1.setOnClickListener {
            val intent = Intent(this, Page1Activity::class.java)
            startActivity(intent)
        }

        // Page3Activity로 이동하는 버튼 설정
        val buttonOpenPage3 = findViewById<Button>(R.id.button_open_page3)
        buttonOpenPage3.setOnClickListener {
            val intent = Intent(this, Page3Activity::class.java)
            startActivity(intent)
        }

        // Page8Fragment를 로드합니다.
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Page8Fragment())
                .commit()
        }
    }
}
