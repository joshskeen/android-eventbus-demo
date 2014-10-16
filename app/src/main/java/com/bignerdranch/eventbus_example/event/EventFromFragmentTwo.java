package com.bignerdranch.eventbus_example.event;

/**
 * Created by joshskeen on 10/16/14.
 */
public class EventFromFragmentTwo {


    private String mGreeting;

    public EventFromFragmentTwo(String greeting) {
        mGreeting = greeting;
    }

    @Override
    public String toString() {
        return "EventFromFragmentTwo{" +
                "mGreeting='" + mGreeting + '\'' +
                "hashCode='" + hashCode() + '\'' +
                '}';
    }
}
