package com.example.android.myapplication.Activity

import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceFragmentCompat
import com.example.android.myapplication.R

class SettingFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        Log.d("p1", "viewSetting")
        //설정창 on
        setPreferencesFromResource(R.xml.consolationdictionary_setting, rootKey)
    }
}