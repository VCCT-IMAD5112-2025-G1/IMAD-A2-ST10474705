package za.co.varsitycollege.imad_a2_st10474705

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class QuestionScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    val questions = arrayOf("Question 1: World War 2 occurred in the 1900's",
        "Question 2: Nelson Mandela was the first democratically elected president of South Africa",
        "Question 3: USA is the biggest country in the world",
        "Question 4: The industrial revolution began in the 18th century",
        "Question 5: The first computer ever invented was invented in 2006")

    val answers = arrayOf("True",
        "True",
        "False",
        "True",
        "False")


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question_screen)

        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val questionsView = findViewById<TextView>(R.id.questionstextView)
        val resetButton = findViewById<Button>(R.id.resetbutton)

        questionsView.text = questions[0]

        trueButton?.setOnClickListener {
            Toast.makeText(
                this@QuestionScreen,
                "True Button Clicked",Toast.LENGTH_LONG
            ).show()
        }

        falseButton?.setOnClickListener {
            Toast.makeText(
                this@QuestionScreen,
                "False Button Clicked",Toast.LENGTH_LONG
            ).show()
        }

        resetButton?.setOnClickListener {
            Toast.makeText(
                this@QuestionScreen,
                "Restarted Quiz",Toast.LENGTH_LONG
            ).show()

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }









    }
}