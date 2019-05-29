package com.vikas.demo;

public class Practice {
	 int a =0;
	 static int b=1;
	 public static void main(String args[]){
		 System.out.println(new Practice().a);
		 System.out.println(b);
		 print();
	 }
	 public static void  print(){
		 System.out.println(new Practice().a);
		 b=2;
		 System.out.println(b);
	 }
}
