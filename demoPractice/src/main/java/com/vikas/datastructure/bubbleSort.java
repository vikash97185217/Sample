package com.vikas.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("enter the zise of the array: ");
		int size = s.nextInt();
		int array[] = new int[size];
		System.out.println("enter "+size+" elements of the array u waana sort: ");
		for(int i =0;i<size;i++){
			array[i]=s.nextInt();
		}*/
		int array[] = {82,9,2,44,56,43};
		array = sort(array);
		System.out.println("Sorted array with bubble sort is:"+Arrays.toString(array));
	}

	private static int[] sort(int[] array) {
		boolean isSorted=false;
		int last = array.length-1;
		while(isSorted==false){
			for(int i = 0;i<last;i++){
				isSorted =true;
				if(array[i]>array[i+1]){
					isSorted=false;
					array = swap(array,i,i+1);
				}
			}
			last--;
		}
		return array;
		
	}

	private static int[] swap(int[] array, int i, int j) {
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
		return array;
		
	}

}
