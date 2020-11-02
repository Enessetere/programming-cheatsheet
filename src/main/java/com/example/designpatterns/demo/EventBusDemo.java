package com.example.designpatterns.demo;

import com.example.designpatterns.architectural.eventbus.*;

public class EventBusDemo {
    public static void main(String[] args) {
        EventBus creationEventBus = new CreationEventBus();
        EventBus actionEventBus = new ActionEventBus();
        Subscriber actionSubscriber = new ActionSubscriber();
        Subscriber creationSubscriber = new CreationSubscriber();
        Subscriber eventSubscriber = new EventSubscriber();
        creationEventBus.register(creationSubscriber);
        creationEventBus.register(eventSubscriber);
        actionEventBus.register(actionSubscriber);
        actionEventBus.register(eventSubscriber);

        actionEventBus.dispatch(new ActionEvent("created"));
        creationEventBus.dispatch(new CreationEvent(200));
    }
}
