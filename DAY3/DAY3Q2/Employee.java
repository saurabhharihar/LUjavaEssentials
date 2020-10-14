package com.p3;

public class Employee {
	int age;
	String name;
	int dob;
	int mob;
	int yob;
	double sal_mon;
	double tax;
	double sal_ann;
	
	void display() {
		System.out.println(" Name of employee is : "+ this.name);
		System.out.println(" Age of employee is : "+ this.age);
	System.out.println(" Annual salary of employee is : Rs. "+this.sal_ann);
	System.out.println(" Tax to be payed by employee is : Rs. "+this.tax);
	
	}
}
