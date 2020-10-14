package com.p5;
import java.util.*;

public class Avenger {
	String name;
	short age;
	String power;
	String planet;
	String weapon;
	Scanner sc=new Scanner(System.in);
	void getDetails() {
		System.out.println(" Enter details of Avenger ");
		System.out.println(" Enter name of avenger ");
		this.name=sc.nextLine();
		System.out.println(" Enter age of avenger");
		this.age=sc.nextShort();
		sc.nextLine();
		System.out.println(" Enter power of avenger");
		this.power=sc.nextLine();
		System.out.println(" Enter planet of avenger ");
		this.planet=sc.nextLine();
		System.out.println(" Enter weapon of avenger");
		this.weapon=sc.nextLine();
	}	
	void displayDetails() {
		System.out.println("--------------------------------------------------");
		System.out.println(" Name of avenger : "+this.name);
		System.out.println(" Age of avenger : "+this.age);	
		System.out.println(" Power of avenger : "+this.power);
		System.out.println(" Planet of avenger : "+this.planet);
		System.out.println(" Weapon of avenger : "+this.weapon);
		System.out.println("--------------------------------------------------");
	}
}