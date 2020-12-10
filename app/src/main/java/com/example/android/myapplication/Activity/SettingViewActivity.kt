package com.example.android.myapplication.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceFragmentCompat
import com.example.android.myapplication.R

class SettingViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_view)

        Log.d("p1", "movesSettingFragment")

        //fragment를 이용해서 설정창을 받는 역할
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentSettingLayout, SettingFragment())
            .commit()
    }

}