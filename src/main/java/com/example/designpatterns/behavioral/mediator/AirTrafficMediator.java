package com.example.designpatterns.behavioral.mediator;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AirTrafficMediator implements TrafficHandler {
    private final Queue<Participant> queue = new PriorityQueue<>(Comparator.comparing(participant -> participant.getPriority().ordinal()));

    @Override
    public void addToSchedule(Participant... participants) {
        for (Participant participant : participants) {
            queue.add(participant);
            sendMessageToParticipant(participant, "You have been added to schedule");
        }
    }

    private void sendMessageToParticipant(Participant participant, String message) {
        participant.receiveMessage(message);
    }

    @Override
    public void changePriority(Participant participant, Priority priority) {
        queue.remove(participant);
        participant.changePriority(priority);
        queue.add(participant);
        sendMessageToParticipant(participant,
                (priority == Priority.PENDING) ? "You are free to engage airstrip." : "Your priority has been changed to " + priority);
    }

    @Override
    public void removeFromSchedule() {
        if (queue.size() > 0) {
            sendMessageToParticipant(queue.poll(), "You have successfully landed.");
        }
    }

    @Override
    public void displayQueue() {
        System.out.println("Awaits for landing: ");
        queue.forEach(System.out::println);
    }

    @Override
    public void process() {
        while (!queue.isEmpty()) {
            Participant participant = queue.peek();
            if (participant.getPriority() != Priority.PENDING) {
                displayQueue();
                changePriority(queue.peek(), Priority.PENDING);
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException exception) {
                throw new RuntimeException("Something went wrong during process.");
            }
        }
    }
}
