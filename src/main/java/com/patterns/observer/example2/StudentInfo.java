package com.patterns.observer.example2;

public class StudentInfo extends MyObservable {

	public StudentInfo(String name, String id) {

		this.name = name;
		this.id = id;
		
	}
	String name;
	String id;
	
	public void change(String id){
		this.id = id;
		updateAll();
	}
	
}
