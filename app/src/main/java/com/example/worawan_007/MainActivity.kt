package com.example.worawan_007

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //การซ่อน title bar
        supportActionBar?.hide()

        btn_phetcaburi.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.phetcaburi)?.let { it1 -> setProvice(it1, getString(R.string.btn_phetcaburi),getString(R.string.history_phetcaburi)) }

        })
        btn_surattani.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.suratthani)?.let { it1 -> setProvice(it1, getString(R.string.btn_surattani),getString(R.string.history_surattani)) }

        })
        btn_chonburi.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.chonburi)?.let { it1 -> setProvice(it1, getString(R.string.btn_chonburi),getString(R.string.history_chonburi)) }

        })

        btn_phuket.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.pphuket)?.let { it1 -> setProvice(it1, getString(R.string.btn_phuket),getString(R.string.history_phuket)) }

        })
    }
         fun setProvice (drawable :Drawable, header:String , content:String ){

            image_province.setImageDrawable(drawable) //เปลี่ยนรูปภาพ
            tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
            tv_history.setText(content) // เปลี่ยนประวัติของแพร่

            Toast.makeText(this,
                "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()
    }
}
