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

        //initializing the buttons id
        val startButton =  findViewById<Button>(R.id.startbutton)

        //Declaring the button so any code put inside the brackets will only run once button is clicked
        startButton?.setOnClickListener {
            //code to create pop-up icon that lets the user know the button was clicked
            Toast.makeText(
                this@MainActivity,
                "Started FlashCards",Toast.LENGTH_LONG
            ).show()

            //code to link once the button is clicked to take the user to the QuestionScreen page
            val intent=Intent(this,QuestionScreen::class.java)
            startActivity(intent)
        }
    }
}