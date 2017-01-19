package com.patterns.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class MyObservable {

	List<MyObserver> obs = null;
	public MyObservable() {
		obs = new ArrayList<>();
	}
	
	
	public void addObserver(MyObserver o){
		obs.add(o);
	}

	public void updateAll() {
		obs.stream()
		.forEach(o -> o.update());
	}
	
	
}
