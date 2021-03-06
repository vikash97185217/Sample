package com.vikas.datastructure;
import java.util.Arrays;
public class MergeSort {
	int[] array;
	static int[] tempArray;
	public  static void main(String[] args) {
		int[] arr =  {5,3,1,4,2,67,22,12};
		new MergeSort().mergeSort(arr);
		System.out.println(Arrays.toString(tempArray));
	}

	private void  mergeSort(int[] arr) {
		int firstIndex=0;
		int lastIndex=arr.length;
		this.array = arr;
		tempArray = new int[lastIndex];
		devideArray(firstIndex,lastIndex);
	}

	private  void devideArray(int firstIndex, int lastIndex) {
		int middle=0;
		if(firstIndex<lastIndex){
			middle= firstIndex+(lastIndex-firstIndex)/2;
			devideArray(firstIndex,middle);
			devideArray(middle+1,lastIndex);
		}
		mergeArray(firstIndex,middle,lastIndex);
		
	}

	private void mergeArray(int firstIndex, int middle, int lastIndex) {
		for(int i =firstIndex;i<lastIndex;i++){
			tempArray[i]=array[i];
		}
		int i =firstIndex;
		int j=middle +1;
		int k =lastIndex;
		while(i<middle && j<=lastIndex){
			if(tempArray[i]<=tempArray[j]){
				array[k]=tempArray[i];
				i++;
			}else{
				array[k]=tempArray[i];
				j++;
			}
			k++;
		}
		while(i<middle){
			array[k]=tempArray[i];
			k++;
			i++;
		}
		
	}

}
