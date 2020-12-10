package com.example.android.myapplication.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.android.myapplication.DataBase.MemberDB
import com.example.android.myapplication.R
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_login_view.*

class LoginViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_view)

//        Log.d("start", "시작")
//
//        // Realm 초기화
//        Realm.init(this@LoginViewActivity)
//        // 현재 스레드에서 Realm의 인스턴스 가져오기
//        val realm = Realm.getDefaultInstance()
//        // 트랜젝션을 시작해 데이터 저장
////        realm.executeTransaction()
//        //데이터베이스에 저장할 객체 생성
////        val memberDB = realm.createObject(MemberDB::class.java)
//
//        //회원가입버튼 클릭 시
//        joinBottom.setOnClickListener() {
//            Log.d("start", "click")
//            val id = getText((R.id.insertId).toInt())
//            val password = getText((R.id.insertPassword).toInt())
//            val repeatPw = getText((R.id.repeatPassword).toInt())
//            val num: Int = 0
//
//            //비번 확인
//            if (password == repeatPw)  {
//                Log.d("start", "비번 같다")
//
//                realm.executeTransaction { realmTransaction ->
//                    val temporaryNum = realmTransaction
//                        .where(MemberDB::class.java)
//                        .max("defaultNum")
//                    val nextNum = temporaryNum?.toInt()?.plus(1) ?: 1
//
//                    realmTransaction.createObject(MemberDB::class.java, 0).apply {
//                        this.id = 0
//                        this.password = password.toString()
//                        this.defaultNum = defaultNum++
//                    }
//                }
//            } else {
//                Log.d("start", "비번이 다르다")
//                // toast로 비번이 틀렸다고 알려주면 좋을 듯
//            }
//        }
//
//        //로그인 버튼 클릭 시
//        loginBottom.setOnClickListener {
//            val correct: Boolean = true
//
//            realm.executeTransaction {
//                val matching = it.where(MemberDB::class.java).findAll()
//                Log.d("start", "$matching")
//            }
//
//            if (correct == true) {
//                val intent = Intent(this, CoverViewActivity::class.java)
//                startActivity(intent)
//            } else {
//
//            }
//        }
    }
}