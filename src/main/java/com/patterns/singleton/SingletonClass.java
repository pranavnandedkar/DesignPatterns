package com.patterns.singleton;

public class SingletonClass {
	
	private SingletonClass sc = null;
	private SingletonClass(){	
	}
	
	public SingletonClass getInstance(){
		if(sc == null){
			sc = new SingletonClass();
		}
		return sc;
	}
}
