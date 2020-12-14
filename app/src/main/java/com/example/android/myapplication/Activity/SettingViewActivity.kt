package com.example.android.myapplication.Activity

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.*
import com.example.android.myapplication.R
import kotlinx.android.synthetic.main.activity_setting_view.*


class SettingViewActivity : AppCompatActivity()/*, PreferenceFragmentCompat.OnPreferenceStartFragmentCallback*/ {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_view)

        Log.d("p1", "movesSettingFragment")

        //fragment를 이용해서 설정창을 받는 역할
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentSettingLayout, SettingFragment())
            .commit()

//        //preference의 값변경 확인
//        val screen: PreferenceScreen =
//
//        val prefs: SharedPreferences
//                = PreferenceManager.getDefaultSharedPreferences(this)
//        prefs.registerOnSharedPreferenceChangeListener { sp , key ->
//            if (key.equals("keyword_screen"))
//                onPreferenceTreeClick( screen ,prefs)
//
//            if (key.equals("sound_list"))
//                Log.d("p1", "클릭된 Preference의 key는 $key")
//        }

    }

//    override fun onPreferenceStartFragment(
//        caller: PreferenceFragmentCompat?,
//        pref: Preference?
//    ): Boolean {
//        val args = pref?.extras
//        val fragment = supportFragmentManager.fragmentFactory.instantiate(
//            classLoader,
//            pref?.fragment.toString()
//        )
//        fragment.arguments = args
//        fragment.setTargetFragment(caller, 0)
//
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.fragmentSettingLayout, SettingKeyword())
//            .addToBackStack(null)
//            .commit()
//        return true
//    }


//    //preference 클릭 확인
//    fun onPreferenceTreeClick(
//        preferenceScreen: PreferenceScreen?,
//        preference: Preference
//    ): Boolean {
//        val key: String = preference.key
//        Log.d("tag", "클릭된 Preference의 key는 $key")
//        return false
//    }


}