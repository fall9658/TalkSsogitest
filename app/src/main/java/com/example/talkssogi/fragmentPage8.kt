package com.example.talkssogi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class Page8Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 이 프래그먼트의 레이아웃을 인플레이트하여 반환
        val view = inflater.inflate(R.layout.page8, container, false)

        // 레이아웃에서 UI 요소를 초기화
        val imageView1: ImageView = view.findViewById(R.id.imageView)
        val imageView2: ImageView = view.findViewById(R.id.imageView2)
        val textView: TextView = view.findViewById(R.id.textView)
        val imageView3: ImageView = view.findViewById(R.id.imageView3)

        // 예시 설정: 필요한 경우 텍스트나 이미지를 설정
        // textView.text = "동적 콘텐츠"
        // imageView1.setImageResource(R.drawable.some_image)
        // imageView2.setImageResource(R.drawable.some_image)
        // imageView3.setImageResource(R.drawable.some_image)

        // 프래그먼트의 뷰를 반환
        return view
    }
}
