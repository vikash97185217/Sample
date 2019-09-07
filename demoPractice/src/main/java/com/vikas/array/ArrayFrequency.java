package com.vikas.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ArrayFrequency {

		public static void main(String args[]){
			/*String str = "vikassharma";
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
			for(int i = 0 ; i<charArray.length ; i++){
				int j = i+1;
				int count = 1;
				if(!hashMap.containsKey(charArray[i])){
					if(j<charArray.length){
						while(charArray[i] == charArray[j]){
							j++;
							count++;
						}
					}
					hashMap.put(charArray[i], count);
				}
			}
			Set<Entry<Character, Integer>> set = hashMap.entrySet();
			for (Entry<Character, Integer> entry : set) {
				System.out.println("charcter:"+entry.getKey()+": frequesncy - "+entry.getValue());
			}*/
			/*String  a ="sandeep";
			String b ="vikas";
			a = a+b;
			b = a.substring(0,(a.length()-b.length()));
			a=a.substring(b.length());
			System.out.println("a:"+a+" b:"+b);*/
			
			String str = "vvviiikkkaaass";
			char[] charArray = str.toCharArray();
			Set set = new HashSet();
			for (char c : charArray) {
				set.add(c);
			}
			String s = "";
			for (Object object : set) {
				s+=(Character)object;
				
			}System.out.println(s);
		}
}
