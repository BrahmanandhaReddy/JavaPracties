package com.java.practies.constractors;

/*one Constructor calling into another Constructor
 * and Constructor overloading  */
public class ConstractorCallingAndOverloading {

	public  ConstractorCallingAndOverloading(int a) {
		 //super(),this() is must be at first line of the  constructor
		 //we have to use only either super() or this()
		 this("Nandhu");
		System.out.println("int-arg Constructor:"+a*a);
	}
	public ConstractorCallingAndOverloading(String a) {
		 this();
			System.out.println("String-arg Constructor:"+a.length());
		}
	public ConstractorCallingAndOverloading() {
		System.out.println("No-arg Constructor");
	}
	public static void main(String[] args) {
		ConstractorCallingAndOverloading ccao=new ConstractorCallingAndOverloading("reddy");
	}
}
