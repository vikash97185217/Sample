package com.vikas.datastructure;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr =  {1,3,5,4,2,67,22,12};
		System.out.println(Arrays.toString(selectionSort(arr)));

	}

	private static int[] selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			if(min!=i){
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min]=temp;
			}
			
		}
		return arr;
	}

}
