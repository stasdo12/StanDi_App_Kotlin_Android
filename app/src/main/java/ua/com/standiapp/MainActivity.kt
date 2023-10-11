package ua.com.standiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val label: TextView = findViewById<TextView>(R.id.main_lable)
    val userData: EditText = findViewById(R.id.user_data)
    val button: Button = findViewById(R.id.button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}