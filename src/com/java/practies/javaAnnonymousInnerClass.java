package com.java.practies;

abstract class Person{
	abstract void eat();
}
interface Eatable{
	void eat();
}
public class javaAnnonymousInnerClass {
	public static void main(String[] args) {
		//with abstract class
		Person p=new Person() {
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("nice fruit");
				
			}
		};
		p.eat();
		//with interfaces
		Eatable e=new Eatable() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("i eat");
			}
		};
		
	}

}
