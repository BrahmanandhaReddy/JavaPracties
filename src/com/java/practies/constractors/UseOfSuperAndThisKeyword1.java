package com.java.practies.constractors;

public class UseOfSuperAndThisKeyword1 {
 
	public int add(int a,int b) {
		return a+b;
	}

}
class Addition extends UseOfSuperAndThisKeyword1{
	int sum;
	public int addition() {
		return this.sum=super.add(10, 40);
	}
	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.addition());
		
	}
}
