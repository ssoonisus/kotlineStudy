package com.mpgio.kotlinstudy

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Gravity
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    private val registerIntent = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {result ->
        if(result.resultCode == RESULT_OK) {
            val data = result.data?.getStringExtra("resultData")?: "No Data"

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        Toast.makeText(this,"test", Toast.LENGTH_LONG).show()

    findViewById<Button>(R.id.login_button).setOnClickListener {
        val userName = findViewById<EditText>(R.id.user_name).text.toString()
        val userPasword = findViewById<EditText>(R.id.user_password).text.toString()

        if(userName.isNotEmpty() && userPasword.isNotEmpty()) {
            if(userName == "sspark" || userPasword == "0000") {

                findViewById<TextView>(R.id.memo_edit).text = getString(R.string.discount_code_confirmation, userName)

            }
        } else {

        }
    }



    }

    companion object {
        private const val TAG = "MainActivity"
    }

}