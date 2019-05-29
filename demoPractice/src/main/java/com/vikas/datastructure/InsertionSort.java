package com.vikas.datastructure;

import java.util.Arrays;


public class InsertionSort {
	public  static void main(String[] args) {
		int[] arr =  {5,3,1,4,2,67,22,12};
		System.out.println(Arrays.toString(insertionSort(arr)));
	}

	private static int[] insertionSort(int[] arr) {
			for (int i = 1; i < arr.length; i++) {
				for(int j = 0 ; j< i;j++){
				if(arr[i]<arr[j]){
					arr = swap(arr,i,j);
				}
			}
		}
		return arr;
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}

}
