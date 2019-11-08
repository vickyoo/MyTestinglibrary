package com.example.mytesinglibrary

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tat.*

class ToastDisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tat)
        tttt!!.setText("Mr.vicky & Mr.bhavin")
        Toast.makeText(this,"Mr.vicky & Mr.bhavin.............",Toast.LENGTH_LONG).show()
    }
}
