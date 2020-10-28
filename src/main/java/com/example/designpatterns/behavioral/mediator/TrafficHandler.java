package com.example.designpatterns.behavioral.mediator;

public interface TrafficHandler {
    void addToSchedule(Participant... participant);
    void removeFromSchedule();
    void changePriority(Participant participant, Priority priority);
    void process();
    void displayQueue();
}
