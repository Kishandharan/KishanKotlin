package com.example.quiz1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Global variables
    val questions = listOf(
        Question(
            text = "What is the word for number 1?",
            options = listOf("One", "1", "Two", "Pizza"),
            correctIndex = 0
        ),
        Question(
            text = "What is the word for number 2?",
            options = listOf("One", "1", "Two", "Pizza"),
            correctIndex = 2
        ),
    )

    lateinit var questionText: TextView
    lateinit var optionBtns : List<Button>

    private var score = 0;
    private var questionNumber = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionText = findViewById(R.id.question_text)
        optionBtns = listOf(
            findViewById(R.id.option1),
            findViewById(R.id.option2),
            findViewById(R.id.option3),
            findViewById(R.id.option4)
        )
        loadQuestion()
        optionBtns.forEachIndexed{ index, button ->
            button.setOnClickListener{
                checkAnswer(index)
            }
        }
    }

   fun loadQuestion() {
       var question = questions[questionNumber];
       questionText.text = question.text;
       optionBtns.forEachIndexed{ index, button ->
           button.text = question.options[index];
       }
   }

   fun checkAnswer(selectedIndex: Int){
       if (selectedIndex == questions[questionNumber].correctIndex){
           score++
       }
       questionNumber++;
       if(questionNumber < questions.size){
           loadQuestion();
       }else{
           val intent = Intent(this,ResultActivity::class.java)
           intent.putExtra("score", score)
           startActivity(intent);
           finish()
       }
   }


}
