package com.vikas.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
	private String name;
	
	private Sallary sallary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sallary getSallary() {
		return sallary;
	}
	public void setSallary(Sallary sallary) {
		this.sallary = sallary;
	}
	public static void main(String...  args){
		List<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		Sallary es1 = new Sallary();
		Sallary es2 = new Sallary();
		Sallary es3 = new Sallary();
		Sallary es4 = new Sallary();
		Sallary es5 = new Sallary();
		es1.setBasic(new BigDecimal(1000));
		es2.setBasic(new BigDecimal(1001));
		es3.setBasic(new BigDecimal(1005));
		es4.setBasic(new BigDecimal(1004));
		es5.setBasic(new BigDecimal(1003));

		es1.setDa(new BigDecimal(100));
		es2.setDa(new BigDecimal(101));
		es3.setDa(new BigDecimal(105));
		es4.setDa(new BigDecimal(104));
		es5.setDa(new BigDecimal(103));
		e1.setName("vikas");
		e2.setName("aikas");
		e3.setName("cikas");
		e4.setName("gikas");
		e5.setName("eikas");
		e1.setSallary(es1);
		e2.setSallary(es2);
		e3.setSallary(es3);
		e4.setSallary(es4);
		e5.setSallary(es5);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		Collections.sort(employees,new EmployeeNameComparator()
				.thenComparing(new SallaryBasicComparator())
				.thenComparing(new SallaryDaComparator()));
		System.out.println(employees);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sallary=" + sallary + "]";
	}
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
}
