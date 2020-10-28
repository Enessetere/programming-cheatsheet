package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.iterator.CollectionOfData;
import com.example.designpatterns.behavioral.iterator.Container;
import com.example.designpatterns.behavioral.iterator.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Container collection = new CollectionOfData();
        for (Iterator iterator = collection.getIterator(); iterator.hasNext(); iterator.next()) {
            System.out.println("Object: " + iterator.get());
        }
    }
}
