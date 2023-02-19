package com.AlbumProject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //화면을 보여주는 코드
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* Application Logic
         * 사진 id => p1 ~ p12
         * Basic level이므로 A~Z까지 수동으로 만들어놓음
         * 사진 12장이 나오고
         * 사진 하나를 터치하면(클릭), 해당 사진이 확대된다.
         * 기본 화면에서 해당 사진을 확대해놓은 화면으로 전환됨
         */

        //1번 사진 클릭, 확대 logic
        val image1 = findViewById<ImageView>(R.id.p1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent1 = Intent(this, photo1Activity::class.java)
            //photo1Activity class는 activity_photo1의 동작

            startActivity(intent1)
        }

        //2번 사진 클릭, 확대 logic
        val image2 = findViewById<ImageView>(R.id.p2)
        image2.setOnClickListener {
            Toast.makeText(this,"2번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent2 = Intent(this, photo2::class.java)
            startActivity(intent2)
        }

        //3번 사진 클릭, 확대 logic
        val image3 = findViewById<ImageView>(R.id.p3)
        image3.setOnClickListener {
            Toast.makeText(this,"3번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent3 = Intent(this, photo3::class.java)
            startActivity(intent3)
        }

        //4번 사진 클릭, 확대 logic
        val image4 = findViewById<ImageView>(R.id.p4)
        image4.setOnClickListener {
            Toast.makeText(this,"4번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent4 = Intent(this, photo4::class.java)
            startActivity(intent4)
        }

        //5번 사진 클릭, 확대 logic
        val image5 = findViewById<ImageView>(R.id.p5)
        image5.setOnClickListener {
            Toast.makeText(this,"5번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent5 = Intent(this, photo5::class.java)
            startActivity(intent5)
        }

        //6번 사진 클릭, 확대 logic
        val image6 = findViewById<ImageView>(R.id.p6)
        image6.setOnClickListener {
            Toast.makeText(this,"6번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent6 = Intent(this, photo6::class.java)
            startActivity(intent6)
        }

        //7번 사진 클릭, 확대 logic
        val image7 = findViewById<ImageView>(R.id.p7)
        image7.setOnClickListener {
            Toast.makeText(this,"7번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent7 = Intent(this, photo7::class.java)
            startActivity(intent7)
        }

        //8번 사진 클릭, 확대 logic
        val image8 = findViewById<ImageView>(R.id.p8)
        image8.setOnClickListener {
            Toast.makeText(this,"8번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent8 = Intent(this, photo8::class.java)
            startActivity(intent8)
        }

        //9번 사진 클릭, 확대 logic
        val image9 = findViewById<ImageView>(R.id.p9)
        image9.setOnClickListener {
            Toast.makeText(this,"9번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent9 = Intent(this, photo9::class.java)
            startActivity(intent9)
        }

        //10번 사진 클릭, 확대 logic
        val image10 = findViewById<ImageView>(R.id.p10)
        image10.setOnClickListener {
            Toast.makeText(this,"10번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent10 = Intent(this, photo10::class.java)
            startActivity(intent10)
        }

        //11번 사진 클릭, 확대 logic
        val image11 = findViewById<ImageView>(R.id.p11)
        image11.setOnClickListener {
            Toast.makeText(this,"11번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent11 = Intent(this, photo11::class.java)
            startActivity(intent11)
        }

        //12번 사진 클릭, 확대 logic
        val image12 = findViewById<ImageView>(R.id.p12)
        image12.setOnClickListener {
            Toast.makeText(this,"12번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent12 = Intent(this, photo12::class.java)
            startActivity(intent12)
        }
    }
}
/* 앱 개발 주저리 주저리
* 1. 첨부한 파일 이름에 대문자가 있어서 에러 발생
*    파일 명에 소문자 a-z, 0~9, _(밑줄)만 들어가야한다. (2023.02.16)
* */