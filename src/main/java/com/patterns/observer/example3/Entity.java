package com.patterns.observer.example3;

import java.util.Observable;

public class Entity extends Observable{

	int i =0;
	
	public void changeInt(int i){
		this.i = i;
        setChanged();
		notifyObservers();
	}
}
