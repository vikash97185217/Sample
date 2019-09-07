package com.vikas.demo;

public class StaticPractice {
	static String name = "vikas";
	static int age =25;
	public static void main(String args[]){
		StaticPractice s =  new  StaticPractice();
		StaticPractice.Parent p = new Parent();
		StaticPractice.Child c = new Child();
		System.out.println(s.name);
		System.out.println(p.name);
		System.out.println(c.name);
		System.out.println(Parent.name);
		System.out.println(Child.name);
		
	}
	private static class Parent{
		static String name ="vikas1";
		static int age = 26;
		public Parent() {
			Parent.name = StaticPractice.name;
			Parent.age = StaticPractice.age;
		}
	}
	private static class Child extends Parent{
		public Child() {
			Child.name = StaticPractice.Parent.name;
			Child.age = StaticPractice.Parent.age;
		}
	}
}
