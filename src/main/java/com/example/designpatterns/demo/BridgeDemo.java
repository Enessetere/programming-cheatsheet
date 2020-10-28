package com.example.designpatterns.demo;

import com.example.designpatterns.structural.bridge.QuizFormat;
import com.example.designpatterns.structural.bridge.QuizQuestions;

public class BridgeDemo {
    public static void main(String[] args) {
        QuizFormat quiz = new QuizFormat();
        quiz.quiz = new QuizQuestions();
        quiz.delete("What?");
        quiz.display();
        quiz.newOne("For what?");
        quiz.displayAll();
    }
}
