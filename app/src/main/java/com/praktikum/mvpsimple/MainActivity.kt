package com.praktikum.mvpsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var etSisi : EditText
    private lateinit var tvHasil : TextView
    private lateinit var btnHL : Button
    private lateinit var btnHK : Button

    private lateinit var mainPresenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etSisi = findViewById(R.id.etSisi)
        tvHasil = findViewById(R.id.tvHasil)
        btnHL = findViewById(R.id.btnHitungLuas)
        btnHK = findViewById(R.id.btnHitungKeliling)


        mainPresenter = MainPresenter(this)

        btnHL.setOnClickListener {
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(sisi)
        }

        btnHK.setOnClickListener {
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(sisi)
        }
    }


    override fun updateLuas(luas: Float){
        tvHasil.text = luas.toString()
    }
    override fun updateKeliling(keliling: Float){
        tvHasil.text = keliling.toString()
    }

    override fun showError(errorMsg: String) {
        tvHasil.text = errorMsg
    }

}
