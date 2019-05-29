package com.vikas.demo;

import java.util.Scanner;

public class AnnuSwap {


	public static void main(String[] args) {
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter String");
		 String[] a=sc.nextLine().split(" ");
		 String sb = new String();
		 for (int i = a.length-1; i>=0; i--) {
			sb=sb+a[i];
			sb=sb+" ";
		}
		 		 
		 System.out.println(sb);
		 
	}
}
