package com.example.designpatterns.behavioral.state;

import java.util.HashMap;
import java.util.Map;

public class DocumentPublicationManager {
    private final Map<String, Document> documentMap = new HashMap<>();

    public void createNewDocument(String author) {
        documentMap.put(author, new Document());
    }

    public void writeArticle(String author, String text) {
        documentMap.get(author).setContent(text);
    }

    public void displayArticle(String author) {
        System.out.println(documentMap.get(author).getContent());
    }

    public void publish(String author, boolean isAdmin) {
        documentMap.get(author).publish(isAdmin);
    }

    public void render(String author) {
        documentMap.get(author).render();
    }
}
