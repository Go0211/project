package com.example.android.myapplication.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import com.example.android.myapplication.MainActivity
import com.example.android.myapplication.R
import kotlinx.android.synthetic.main.activity_cover_view.*

class CoverViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cover_view)

        val actionBar: ActionBar? = supportActionBar

        coverLayout.setOnClickListener {
            Log.d("p1", "clickLayout")
            val intent = Intent(this, ContentViewActivity::class.java)
            startActivity(intent)
        }
    }

    //메뉴가 무효화되지 않으면 호출x
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.d("p1", "createOption")
        menuInflater.inflate(R.menu.consolationdictionary_menu, menu)
        return true
    }

    //옵션 메뉴가 화면에 보여질 때 마다 호출
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Log.d("p1", "prepareOption")
        return super.onPrepareOptionsMenu(menu)
    }

    //메뉴안 아이템 선택 시
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d("p1", "select")

        when(item.itemId) {
            R.id.refresh -> Log.d("p1", "clickRefresh")
            R.id.setting -> {
                Log.d("p1", "clickSetting")

                val intent = Intent(this, SettingViewActivity::class.java)
                startActivity(intent)
            }
            R.id.copy -> Log.d("p1", "clickCopy")
            R.id.share -> Log.d("p1", "clickShare")
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        Log.d("p1", "finish")
        this.finish()
        super.onDestroy()
    }
}