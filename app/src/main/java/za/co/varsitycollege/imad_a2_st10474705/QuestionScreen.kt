package za.co.varsitycollege.imad_a2_st10474705

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class QuestionScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    //declaration of array of questions that will be displayed
    val questions = arrayOf("Question 1: World War 2 occurred in the 1900's",
        "Question 2: Nelson Mandela was the first democratically elected president of South Africa",
        "Question 3: USA is the biggest country in the world",
        "Question 4: The industrial revolution began in the 18th century",
        "Question 5: The first computer ever invented was invented in 2006")

    //declaration of array of answers to questions that will be used to check if answer is correct or incorrect
    val answers = arrayOf(
        true,
        true,
        false,
        true,
        false)

    //setting index to start at 0 when going through array
    private var currentQuestionIndex = 0
    //setting counter for score to 0
    private var score = 0


    //initialising all buttons and text view ids to be used in code
    private val trueButton = findViewById<Button>(R.id.trueButton)
    private val falseButton = findViewById<Button>(R.id.falseButton)
    private val resetButton = findViewById<Button>(R.id.resetbutton)
    val handler = Handler(Looper.getMainLooper())


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question_screen)




        showQuestion()

        //opening coding for true button
        trueButton?.setOnClickListener {
            //creating pop-up to let user know button was clicked
            Toast.makeText(
                this@QuestionScreen,
                "True Button Clicked",Toast.LENGTH_LONG
            ).show()
            checkAnswer(true)
        }

        //opening coding for false button
        falseButton?.setOnClickListener {
            //creating pop-up to let user know button was clicked
            Toast.makeText(
                this@QuestionScreen,
                "False Button Clicked",Toast.LENGTH_LONG
            ).show()
            checkAnswer(false)
        }

        //opening coding for reset button
        resetButton?.setOnClickListener {
            //creating pop-up to let user know button was clicked
            Toast.makeText(
                this@QuestionScreen,
                "Restarted Quiz", Toast.LENGTH_LONG
            ).show()

            //code that once the button is clicked will take the user back to the welcome page
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    //initializing textview id to be used in code
    private var questionsTextView = findViewById<TextView>(R.id.questionstextView)
    

    //creating function for textview for questions to appear in
    @SuppressLint("SetTextI18n")
    private fun showQuestion(){
        //if function to iterate through each question until all 5 questions have been answered
        if (currentQuestionIndex < questions.size){
            questionsTextView.text = questions[currentQuestionIndex]
        }else{
            questionsTextView.text = "Quiz Completed!"
        }
    }
    
    //creating function that will check answer in array compared to answer of user
    private fun checkAnswer(userAnswer: Boolean){
        val right = answers[currentQuestionIndex]
        //code to display pop-up if answer was correct or incorrect
        if (userAnswer == right){
            score++
            Toast.makeText(this,"Correct",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Incorrect",Toast.LENGTH_LONG).show()
        }
        trueButton.isEnabled = false
        falseButton.isEnabled = false

        handler.postDelayed({
        currentQuestionIndex++

            if (currentQuestionIndex < questions.size){
                showQuestion()
                trueButton.isEnabled = true
                falseButton.isEnabled = true
            }else{
                //sending score to score screen to be displayed
                val intent = Intent(this, ScoreScreen::class.java)
                intent.putExtra("score",score)
                startActivity(intent)
                finish()
            }
        },1000)

    }
}