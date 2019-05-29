package com.vikas.demo;

public class Example extends Demo {
	 
public static void main(String args[]) {
	Demo e = new Example();
	e.addition();
	Demo.a=1;
	e.b=3;
	System.out.println("Example class"+" "+Demo.a+" "+Demo.a1+" "+e.b);
}

public void deletion() {
	// TODO Auto-generated method stub
	
}
}
