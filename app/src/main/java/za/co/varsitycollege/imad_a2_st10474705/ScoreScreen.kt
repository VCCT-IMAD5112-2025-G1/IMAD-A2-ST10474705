package za.co.varsitycollege.imad_a2_st10474705

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity




class ScoreScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_screen)

        //initializing text views and buttons id's
        val scoreTextView = findViewById<TextView>(R.id.scoretextView)
        val feedbackTextView = findViewById<TextView>(R.id.feedbacktextView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        //grabs score from previous page
        val score = intent.getIntExtra("score",0)
        scoreTextView.text = "Total Score: $score / 5"

        //code that checks the score the user got and displays a specified message according to that score
        val feedback = when(score){
            5 -> "Amazing!"
            in 3..4 -> "Well Done!"
            in 1..2 -> "You can do better"
            else -> "Go Again."
        }
        //displaying their feedback message based off their score
        feedbackTextView.text = feedback

        //opening coding for review button
        reviewButton?.setOnClickListener {
            Toast.makeText(
                this@ScoreScreen,
                "Started FlashCards",Toast.LENGTH_LONG
            ).show()

            //code to link once the button is clicked to take the user to the ReviewQuestions page
            val intent= Intent(this, ReviewQuestions::class.java)
            startActivity(intent)

        }

        //opening coding for exit button
        exitButton?.setOnClickListener {
            //code that once button is clicked will exit app
            finishAffinity()
        }

    }
}