package com.patterns.builder;

public class Builder {

	public User getUser() {
		return new
				User.UserBuilder("Pranav", "Nandedkar")
				.age(30)
				.phone("444")
				.address("something")
				.build();
	}
	public static void main(String[] args) {
		new Builder().getUser();
	}
}
