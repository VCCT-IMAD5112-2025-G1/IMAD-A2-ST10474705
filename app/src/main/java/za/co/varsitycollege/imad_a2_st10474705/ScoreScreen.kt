package za.co.varsitycollege.imad_a2_st10474705

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity




class ScoreScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_screen)

        val scoreTextView = findViewById<TextView>(R.id.scoretextView)
        val feedbackTextView = findViewById<TextView>(R.id.feedbacktextView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        val score = intent.getIntExtra("score",0)
        scoreTextView.text = "Total Score: $score / 5"

        val feedback = when(score){
            5 -> "Amazing!"
            in 3..4 -> "Well Done!"
            in 1..2 -> "You can do better"
            else -> "Go Again."
        }
        feedbackTextView.text = feedback

        reviewButton?.setOnClickListener {

        }

        exitButton?.setOnClickListener {
            finishAffinity()
        }

    }
}