package com.patterns.observer.example2;

public class Demo {

	public static void main(String[] args) {

		StudentInfo si = new StudentInfo("pranav","12342");
//		MyObserver o = new MyObserver() {
//			
//			@Override
//			public boolean update() {
//				System.out.println("updated....");
//				return false;
//			}
//		};
		
		
		si.addObserver(() -> System.out.println("Updated...."));
		
		
		
		
		si.change("32432");
		si.change("32432");
		si.change("32432");
		si.change("32432");
		si.change("32432");
		si.change("32432");
	}

}
