package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        val tvName: TextView = findViewById(R.id.tvPlayerName)
        val tvScore : TextView = findViewById(R.id.tvScore)
        val btnFinish : Button = findViewById(R.id.btnFinish)

        var mUserName = intent.getStringExtra(Constants.USER_NAME)
        var mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        var mTotalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        tvName.text = mUserName
        tvScore.text = "Your Score is $mCorrectAnswers out of $mTotalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}