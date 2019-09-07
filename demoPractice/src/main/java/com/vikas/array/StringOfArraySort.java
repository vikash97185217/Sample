package com.vikas.array;

import java.util.Arrays;

public class StringOfArraySort {

	public static void main(String... args){
		String[] cities = {"delhi","faridabad","gujrat","mumbai","mathura"}; 
		StringOfArraySort.sort(cities);
	}

	private static void sort(String[] cities) {
		for (int i=0;i <cities.length;i++) {
			for (int j = 0;j<cities.length;j++) {
				if(cities[i].length()<cities[j].length())
					StringOfArraySort.swap(cities,i,j);
			}
		}
		System.out.println(Arrays.toString(cities));
		
	}

	private static void swap(String[] cities, int i, int j) {
		String temp = cities[i];
		cities[i] = cities[j];
		cities[j] = temp;
		
	}
}
