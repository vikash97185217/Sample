package com.vikas.demo;

public class annu {
 int a=1;//instance variable
 int b=2;
 static int d=0;//class variable
 Integer x=0;
 annu(){
	 System.out.println("in defaault const");
 }
	public static void main(String[] args) {
		System.out.println("in main method");
		int c=0;//local variable
		annu a= new annu();
		c =a.sum();
		System.out.println("in main method a + b = "+c);
	}
 public int sum(){
	 System.out.println("in sum method"+ a+b );
	return a+b; 
 }
}
