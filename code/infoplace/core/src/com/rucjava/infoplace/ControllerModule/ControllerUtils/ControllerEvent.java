package com.rucjava.infoplace.ControllerModule.ControllerUtils;

import com.badlogic.gdx.math.Vector2;

public class ControllerEvent {
    private EventType eventType;
    private Vector2 position;

    public ControllerEvent(EventType eventType, Vector2 position) {
        this.eventType = eventType;
        this.position = position;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Vector2 getPosition() {
        return position;
    }
}
