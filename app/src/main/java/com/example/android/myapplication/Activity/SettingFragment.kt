package com.example.android.myapplication.Activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.preference.*
import com.example.android.myapplication.R

class SettingFragment : PreferenceFragmentCompat() {


    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        Log.d("p1", "viewSetting")
        //설정창 on + 값은 저장되어져 남아있다.
        setPreferencesFromResource(R.xml.consolationdictionary_setting, rootKey)

        val pref: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity)

        val message: SwitchPreferenceCompat? = findPreference("message")
        val screen: PreferenceScreen? = findPreference("keyword_screen")
        val sound: SwitchPreferenceCompat? = findPreference("sound")
        val soundList: ListPreference? = findPreference("sound_list")
        val site: Preference? = findPreference("officialSite")

        //이것들로 조건문을 돌리면 조건문이 제기능을 못함
        var messageBoolean = pref.getBoolean("message", false)
        var soundBoolean = pref.getBoolean("sound", false)

        //setting message 클릭 시
        message?.setOnPreferenceClickListener {
            if (pref.getBoolean("message", true)) {
                Log.d("p1", "messageAlarmOn ${pref.getBoolean("message", true)}")
            } else {                    /*${pref.getBoolean("message", false)}*/
                Log.d("p1", "messageAlarmOff ${pref.getBoolean("message", true)}")
            }
            true
        }

        //sound message 클릭 시
        sound?.setOnPreferenceClickListener {
            if (pref.getBoolean("sound", true)) {
                Log.d("p1", "SoundAlarmOn ${pref.getBoolean("sound", true)}")
            } else {
                Log.d("p1", "SoundAlarmOff ${pref.getBoolean("sound", true)}")
            }
            true
        }

        //인터넷 사이트로 이동
        site?.setOnPreferenceClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("http://www.google.com")
//            webpagePreference.setIntent(intent)
            //근데 이거 안돼 ㅅㅂ
            true
        }
    }
}

