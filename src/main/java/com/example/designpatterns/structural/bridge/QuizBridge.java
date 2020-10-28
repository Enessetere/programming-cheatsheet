package com.example.designpatterns.structural.bridge;

public class QuizBridge {
    public Quiz quiz;

    public void next() {
        quiz.nextQuestion();
    }

    public void previous() {
        quiz.previousQuestion();
    }

    public void newOne(String question) {
        quiz.addQuestion(question);
    }

    public void delete(String question) {
        quiz.removeQuestion(question);
    }

    public void display() {
        quiz.displayQuestion();
    }

    public void displayAll() {
        quiz.displayAllQuestions();
    }
}
