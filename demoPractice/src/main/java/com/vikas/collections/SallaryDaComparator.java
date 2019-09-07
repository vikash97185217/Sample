package com.vikas.collections;

import java.util.Comparator;

public class SallaryDaComparator implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		System.out.println("Da value : "+o1.getSallary().getDa().compareTo(o2.getSallary().getDa()));
		return o1.getSallary().getBasic().compareTo(o2.getSallary().getBasic());
	}
}
