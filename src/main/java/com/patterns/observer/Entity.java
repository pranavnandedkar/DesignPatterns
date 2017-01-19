package com.patterns.observer;

import java.util.Observable;

public class Entity extends Observable{

	int i =0;
	
	public void changeInt(int i){
		this.i = i;
        setChanged();
		notifyObservers();
	}
}
