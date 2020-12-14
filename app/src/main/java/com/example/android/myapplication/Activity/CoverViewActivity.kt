package com.example.android.myapplication.Activity

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import com.example.android.myapplication.MainActivity
import com.example.android.myapplication.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_cover_view.*

class CoverViewActivity : AppCompatActivity() {
    lateinit var toast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cover_view)

        supportActionBar    // 뒤로가기 버튼 만들어보기

        //화면클릭 시 랜덤사전 값을 가진 layout으로 이동
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

                //설정창으로 이동
                val intent = Intent(this, SettingViewActivity::class.java)
                startActivity(intent)
            }
            R.id.copy -> {
                Log.d("p1", "clickCopy")
                toast = Toast.makeText(
                    this@CoverViewActivity,
                    R.string.copyToast,
                    Toast.LENGTH_SHORT)
                toast.show()
            }
            R.id.share -> {
                Log.d("p1", "clickShare")
            }
            R.id.download -> {
                Log.d("p1", "clickDownload")

                //알림 내용물
                var mbuilder = NotificationCompat.Builder(this,"download")
                    .setSmallIcon(R.drawable.monitor)
                    .setContentTitle("다운로드")
                    .setContentText("다운로드 중")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)

                this.createNotificationChannel()

                //알림 표시
                with(NotificationManagerCompat.from(this)) {
                    // notificationId is a unique int for each notification that you must define
                    notify(0, mbuilder.build())
                    Log.d("p1", "downloadNotification")
                }

                //다운로드시 스낵바 시작
                val snackBar = Snackbar.make(
                    coverLayout,
                    R.string.downloadSnackBar,
                    Snackbar.LENGTH_SHORT)
                snackBar.setAction(R.string.downloadSnackBar, ClickListener())
                snackBar.show()

                Log.d("p1", "Downloading")
            }
            R.id.customerService -> {
                Log.d("p1", "moveCustomerService")

                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.naver.com/")
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    //알림을 시스템에 설정
    fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.downloadNotification)
            val descriptionText = getString(R.string.downloadNotification)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("download", name, importance)
                .apply {
                    description = descriptionText
                }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    override fun onDestroy() {
        Log.d("p1", "finish")
        this.finish()
        super.onDestroy()
    }
}

class ClickListener: View.OnClickListener {
    override fun onClick(v: View?) {
        //클릭 시 행위?
    }
}