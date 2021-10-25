package com.java.practies.oops;

public class Restaurant {

	public void dinner(Person p) {
		System.out.println("Passing the Person object to method of another class");
		System.out.println(p.eat(p.getName()));
		
	}
}
