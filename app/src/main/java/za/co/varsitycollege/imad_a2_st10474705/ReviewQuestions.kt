package za.co.varsitycollege.imad_a2_st10474705

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewQuestions : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review_questions)

        val returnButton = findViewById<Button>(R.id.returnbutton)

        returnButton?.setOnClickListener {
            Toast.makeText(
                this@ReviewQuestions,
                "Returned", Toast.LENGTH_LONG
            ).show()

            val intent = Intent(this, ScoreScreen::class.java)
            startActivity(intent)
        }
    }
}