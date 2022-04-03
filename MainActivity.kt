package com.example.evinurastinaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var Button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button = findViewById(R.id.button)
        //Button ditambahkan pada program ini berfungsi untuk menampilkan kalimat "Online Shop Terpercaya" yang terdapat pada atas logo


        Button.setOnClickListener(this)
        //button berikut ini berfungsi untuk digunakan pada tombol login,agar membawa kehalaman selanjutnya
    }

    override fun onClick(v: View) {
        when(v.id){
            //when memiliki fungsi yang salah satunya untuk id yang akan dihubungkan kehalaman selanjutnya
            R.id.button ->{
                //R.id.button ini digunakan karena fitur tombol login menggunakan button
                val login = Intent(this@MainActivity, MainActivity2::class.java)
                //Intent adalah pusat untuk menghubungkan class yang satu dan yang lainnya(@MainActivity & MainActivity2)
                startActivity(login)
                //startActivity berfungsi untuk mulai mmenjalankan apk,jika tidak terdapat pesan  error makan akan dapat berhasil di run
                //login adalah tombol untuk membawa dan membuka ke halaman selanjutnya
            }
        }
    }
}