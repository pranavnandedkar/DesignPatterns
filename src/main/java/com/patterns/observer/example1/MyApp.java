package com.patterns.observer.example1;
import java.util.Observable;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();
        
        // New java 8 style with lambda expressions
        eventSource.addObserver( (Observable obj, Object arg) -> { 
            System.out.println("Received response: " + arg);
        });        
        /*
        eventSource.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Received response: " + arg);
            }
        });
        */
        
        new Thread(eventSource).start();
    }
}
/*
interface Observer{
    public void update(Observable obj, Object arg);
}*/