package com.example.android.myapplication.example

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.android.myapplication.R

class Menu_Example  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //액션바 설정
        val actionBar: ActionBar? = supportActionBar
//        actionBar?.show()   //액션바 보여주기
//        actionBar?.hide()   //액션바 감추기

    }
    //201210 메뉴 생성
    //초기 생성용
    //메뉴가 무효화되지 않으면 호출x
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater.inflate(R.menu.menu_example, menu)
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
            R.id.icon -> Log.d("p1", "icon")
            R.id.menu1 -> Log.d("p1", "menu1")
            R.id.menu2 -> Log.d("p1", "menu2")
        }
        return super.onOptionsItemSelected(item)
    }
    //부동 컨텍스트 메뉴 + 상황별 작업모음 다음에 필요할 때 사용
}