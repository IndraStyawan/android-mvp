package com.praktikum.mvpsimple

class MainPresenter(private val mainView: MainActivity) {
    fun hitungLuasPersegi(sisi: Float){
        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }

        val luas = sisi * sisi
        mainView.updateLuas(luas)
    }
    fun hitungKelilingPersegi(sisi: Float){

        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }


        val keliling = 4*sisi
        mainView.updateKeliling(keliling)

    }
}