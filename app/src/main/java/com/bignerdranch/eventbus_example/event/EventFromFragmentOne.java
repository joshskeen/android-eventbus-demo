package com.bignerdranch.eventbus_example.event;

/**
 * Created by joshskeen on 10/16/14.
 */
public class EventFromFragmentOne {


    private String mGreeting;

    public EventFromFragmentOne(String greeting) {
        mGreeting = greeting;
    }

    @Override
    public String toString() {
        return "EventFromFragmentOne{" +
                "mGreeting='" + mGreeting + '\'' +
                "hashCode='" + hashCode() + '\'' +
                '}';
    }
}
