package com.vikas.demo;

public class ArraylistExampleMain {
	public static void main(String[] args) {
		System.out.println("Main starts");
		String[] a = {"0","0","1","1"};
		for(String one : a){
			System.out.println(one+" ");
		}
		for(int i=0; i<a.length;i++){
			String a1 = a[i];
			int j = 0;
			String s = String.valueOf(a1);
			while(j++<i){
				s+=a1;
			}
			a[i]=s;
		}
		System.out.println("a: "+a);
		for(String one : a){
			System.out.println(one+" ");
		}
		System.out.println("Main ends");
	}
}
