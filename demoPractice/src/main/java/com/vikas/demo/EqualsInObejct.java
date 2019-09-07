package com.vikas.demo;

public class EqualsInObejct {

	public static void main(String[] args) {
		EqualsInObejct c =  new EqualsInObejct();
		EqualsInObejct.Parent1 p = c.new Parent1();
		EqualsInObejct.Parent2 p1 = c.new Parent2();
		EqualsInObejct.Parent1.p3 p3 = p.new p3();
	}
	private class Parent1{
		private class p3{
			String name = "abc";
		}
		String name = "abc";
	}
	private class Parent2{
		String name = "abc";
	}
}


