package com.example.quiz1

data class Question(
    val text: String,
    val options: List<String>,
    val correctIndex: Int
)
