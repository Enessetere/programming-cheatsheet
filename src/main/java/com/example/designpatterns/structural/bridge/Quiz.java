package com.example.designpatterns.structural.bridge;

public interface Quiz {
    void nextQuestion();
    void previousQuestion();
    void displayQuestion();
    void addQuestion(String question);
    void removeQuestion(String question);
    void displayAllQuestions();
}
