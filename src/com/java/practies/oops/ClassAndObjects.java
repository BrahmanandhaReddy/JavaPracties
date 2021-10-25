package com.java.practies.oops;
class Person{
	//The best practices is design class members as private and
	//provide access using public methods(setters/getters)
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person() {
		super();
	}
	public String eat(String name) {
		return name+" eat Biryani";
		
	}
	public String sleep(String name) {
		return name+" sleep at 9";
		
	}
	
}
public class ClassAndObjects {
	
public static void main(String[] args) {
	
	System.out.println(new Person().hashCode());//366712642
	System.out.println(new Person().hashCode());//1829164700
	//the below two methods are called on two difference object 
	System.out.println(new Person().eat("Nandhu"));
	System.out.println(new Person().sleep("Mohan"));
	//if we want to use morethan one method then we create object with reference
	//here both methods called single object using reference
	Person p=new Person();
	p.eat("Brahma");
	p.sleep("Rosireddy");
	Restaurant r=new Restaurant();
	//we use direct object like new Person("Raghuram", 20) 
	//when we need to pass an object to a method.
	r.dinner(new Person("Raghuram", 20));
	//Also, we can use a direct object statement to call a single method on an object as shown below.
	System.out.println(new Person().eat("Veera Mohan Reddy"));
}

}
