package com.example.designpatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestions implements Quiz {
    private List<String> questions;
    private int currentQuestionNumber;

    public QuizQuestions() {
        questions = new ArrayList<>();
        questions.add("What?");
        questions.add("Why?");
        questions.add("Where?");
        questions.add("How?");
    }

    @Override
    public void nextQuestion() {
        if (currentQuestionNumber < questions.size() - 1) {
            currentQuestionNumber++;
        }
    }

    @Override
    public void previousQuestion() {
        if (currentQuestionNumber > 0) {
            currentQuestionNumber--;
        }
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(currentQuestionNumber));
    }

    @Override
    public void addQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void removeQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayAllQuestions() {
        questions.forEach(System.out::println);
    }
}
