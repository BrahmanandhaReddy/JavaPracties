package com.java.practies.constractors;

public class UseOfSuperAndThisKeyword2 {

	String s="Parent Variable";	
	
}
 class chaildClass extends UseOfSuperAndThisKeyword2{
	String s="Chaild Variable";
	//From static area we cant use this and super keyword 
	//if we use we get compail time error
	/*
	 * public static void m1() { System.out.println(s); System.out.println(super.s);
	 * }
	 */
	public  void m1() {
		System.out.println(s);
		System.out.println(super.s);
	}
	public static void main(String[] args) {
		chaildClass cc=new chaildClass();
		cc.m1();
	}
}
