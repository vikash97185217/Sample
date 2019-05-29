package com.vikas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemo {
	int a;
	static int b;
	
public static void main(String args[]) {
	List<String> listMain = new ArrayList<String>();
	listMain.add("d");
	listMain.add("b");
	listMain.add("c");
	Collections.sort(listMain);
	Iterator<String> itr = listMain.iterator();
	/*while (itr.hasNext()){
		System.out.println(itr.next());
	}*/
	LinkedList<String> linkedList = new LinkedList<>();
	linkedList.add("aaa");
	linkedList.add("bbb");
	linkedList.add("xxx");
	linkedList.addAll(listMain);
	for (String string : linkedList) {
		if(string.equals("d")||string.equals("b")||string.equals("c"))
		linkedList.remove(string);
	}
	Iterator<String> itr1 = linkedList.iterator();
	while (itr1.hasNext()){
		System.out.println(itr1.next());
	}
	/*ArrayList<String> list = new ArrayList<String>();
	list.addAll(listMain);
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.addAll(list);
	Iterator<String> itr = linkedList.iterator();
	while (itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("============Linked list over Set starts=============");
	Set<String> set = new HashSet<String>();
	set.addAll(linkedList);
	Iterator<String> it = set.iterator();
	for (String string : set) {
		System.out.println(string);
	}
	System.out.println("============Set over Hashmap starts=============");
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(3,"c");
	map.put(1,"c");
	map.put(2,"c");
	map.put(4,"c");
	Iterator<Entry<Integer, String>> entrySetItr = map.entrySet().iterator();
	while(entrySetItr.hasNext()){
		System.out.println(entrySetItr.next());
	}
	System.out.println("============Hasmap over treemap starts=============");
	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
	treeMap.putAll(map);
	treeMap.forEach((k,v) -> System.out.println("Key = "
            + k + ", Value = " + v+" hascode :"+v.hashCode()));
	System.out.println("============Treemap over na starts=============");
	NavigableMap<Integer, String> navigableMap = new TreeMap<Integer, String>();
	navigableMap.putAll(treeMap);
	HashMap<Student, String> hashMap =  new HashMap<Student, String>();
	HashMap<Integer, String> hashMap1 =  new HashMap<Integer, String>();
	hashMap1.put(1, "present");
	hashMap1.put(1, "present");
	Student s =  new Student(1,"vikas");
	Student s1 =  new Student(1,"vikas");
	hashMap.put(s, "present");
	hashMap.put(s1, "present");
	System.out.println(hashMap.get(s).hashCode());
	System.out.println(hashMap.get(s1).hashCode());
	System.out.println(hashMap.size());
	System.out.println(hashMap1.size());*/
	}
}
