package com.vikas.array;

import java.util.Arrays;

public class ArrayDemo {
	int[] arr = {1,2,3,3,42,1,13,22};
	public static void main(String args[]){
		int[] arr = {2,3,4,53,1,1,1};
		System.out.println(Arrays.toString(deletFromArray(arr,1)));
		System.out.println(countFromArray(arr,1));
}
	private static int[] deletFromArray(int[] arr,int num){
		int[] arr2=new int[arr.length-1];
		int j =0;
		for(int i =0; i <arr.length;i++){
			if(arr[i]!=num){
				arr2[j++]=arr[i];
			}
		}
		int[] arr3 = new int[j];
		arr3=arr2;
		return arr3;
	}
	private static int countFromArray(int[] arr,int num){
		int j =0;
		for(int i =0; i <arr.length;i++){
			if(arr[i]==num){
				j++;
			}
		}
		return j;
	}
}
