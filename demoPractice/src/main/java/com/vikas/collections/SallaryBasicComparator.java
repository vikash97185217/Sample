package com.vikas.collections;

import java.util.Comparator;

public class SallaryBasicComparator implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		System.out.println("basic value : "+o1.getSallary().getBasic().compareTo(o2.getSallary().getBasic()));
		return o1.getSallary().getBasic().compareTo(o2.getSallary().getBasic());
	}

}
