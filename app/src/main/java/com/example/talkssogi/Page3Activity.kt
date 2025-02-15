package com.example.talkssogi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Page3Activity : AppCompatActivity() {

    companion object {
        const val REQUEST_CODE_SELECT_FILE = 1
    }

    private lateinit var tvSelectedFile: TextView  // 멤버 변수로 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3)  // page3.xml 레이아웃을 설정합니다.

        // ImageView, TextView, ImageButton, Button의 참조를 가져옵니다.
        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        val imageView3: ImageView = findViewById(R.id.imageView3)
        val imageView2: ImageView = findViewById(R.id.imageView2)
        tvSelectedFile = findViewById(R.id.tvSelectedFile)  // 초기화
        val btnUploadFile: ImageButton = findViewById(R.id.btnUploadFile)
        val btnAnalysisFile: Button = findViewById(R.id.btnAnalysisFile)

        // tvSelectedFile 클릭 이벤트 설정
        tvSelectedFile.setOnClickListener {
            openFileChooser()
        }

        // 파일 업로드 버튼 클릭 이벤트 설정
        btnUploadFile.setOnClickListener {
            openFileChooser()
        }

        // 파일 분석 버튼 클릭 이벤트 설정
        btnAnalysisFile.setOnClickListener {
            analyzeFile()
        }

        // 기타 초기화 작업 수행
        imageView.setImageResource(R.drawable.smile)
        textView.text = "분석할 파일을 업로드하세요."
    }

    private fun openFileChooser() {
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "*/*"
            addCategory(Intent.CATEGORY_OPENABLE)
        }
        startActivityForResult(intent, REQUEST_CODE_SELECT_FILE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_SELECT_FILE && resultCode == Activity.RESULT_OK) {
            val fileUri = data?.data
            tvSelectedFile.text = fileUri?.path ?: "파일 선택 실패"
        }
    }

    private fun analyzeFile() {
        tvSelectedFile.text = "파일 분석 중..."
        // 실제 분석 로직을 추가하세요.
        // 분석이 완료되면 결과를 표시합니다.
        tvSelectedFile.text = "파일 분석 완료"
    }
}
