package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.state.DocumentPublicationManager;

public class StateDemo {
    public static void main(String[] args) {
        DocumentPublicationManager publicationManager = new DocumentPublicationManager();

        String JaneDoe = "JaneDoe";
        String JohnSmith = "JohnSmith";

        publicationManager.createNewDocument(JaneDoe);
        publicationManager.createNewDocument(JohnSmith);

        publicationManager.writeArticle(JaneDoe, "JaneDoe article");
        publicationManager.writeArticle(JohnSmith, "JohnSmith article");

        publicationManager.displayArticle(JaneDoe);
        publicationManager.displayArticle(JohnSmith);

        publicationManager.render(JaneDoe);
        publicationManager.displayArticle(JaneDoe);

        publicationManager.publish(JaneDoe, false);
        publicationManager.publish(JohnSmith, true);

        publicationManager.displayArticle(JaneDoe);
        publicationManager.displayArticle(JohnSmith);

        publicationManager.publish(JaneDoe, false);
        publicationManager.publish(JohnSmith, false);

        publicationManager.displayArticle(JaneDoe);
        publicationManager.displayArticle(JohnSmith);

        publicationManager.render(JaneDoe);
        publicationManager.render(JohnSmith);

        publicationManager.displayArticle(JaneDoe);
        publicationManager.displayArticle(JohnSmith);
    }
}
