package com.example.android.myapplication.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.example.android.myapplication.R
import kotlinx.android.synthetic.main.activity_content_view.*
import java.util.*

class ContentViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_view)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()

        val random = Random()
        val num = random.nextInt(10)
        var click = 1
        val ment = findViewById<TextView>(R.id.content)

        when (num) {
            0 -> ment.setText("괜")
            1 -> ment.setText("찮")
            2 -> ment.setText("아")
            3 -> ment.setText("잘")
            4 -> ment.setText("될")
            5 -> ment.setText("거")
            6 -> ment.setText("야")
            7 -> ment.setText("~")
            8 -> ment.setText("?")
            9 -> ment.setText("!")
        }

        Log.d("doing", "start")

        contentLayout.setOnClickListener {
            val num = random.nextInt(10)

            when (num) {
                0 -> ment.setText("괜")
                1 -> ment.setText("찮")
                2 -> ment.setText("아")
                3 -> ment.setText("잘")
                4 -> ment.setText("될")
                5 -> ment.setText("거")
                6 -> ment.setText("야")
                7 -> ment.setText("~")
                8 -> ment.setText("?")
                9 -> ment.setText("!")
            }

            Log.d("doing", "num : $num click : $click")
            click++
        }
    }
}