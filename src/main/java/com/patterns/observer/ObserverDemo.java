package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Entity ent = new Entity();
		System.out.println("Starting .... ");
		/*Observer o = new Observer() {
			
			public void update(Observable o, Object arg) {
				System.out.println("Received response");
				
			}
		};*/
		ent.addObserver((Observable o, Object arg) -> System.out.println("Received response"));
		
		ent.changeInt(5);
		
		
		
	}

	
}
