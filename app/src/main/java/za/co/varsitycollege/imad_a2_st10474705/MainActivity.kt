package za.co.varsitycollege.imad_a2_st10474705

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val startButton =  findViewById<Button>(R.id.startbutton)

        startButton?.setOnClickListener {

            Toast.makeText(
                this@MainActivity,
                "Started FlashCards",Toast.LENGTH_LONG
            ).show()

            val intent=Intent(this,QuestionScreen::class.java)

            startActivity(intent)
        }
    }
}