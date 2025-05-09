package za.co.varsitycollege.imad_a2_st10474705

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class QuestionScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question_screen)

        var trueButton = findViewById<Button>(R.id.trueButton)
        var falseButton = findViewById<Button>(R.id.falseButton)
        var nextButton = findViewById<Button>(R.id.nextquestionbutton)
    }
}