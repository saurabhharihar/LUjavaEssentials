package com.p5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avenger[] arr3=new Avenger[5];
		for(int i=0;i<5;i++) {
		arr3[i]=new Avenger();
		}
		for(int i=0;i<5;i++) {
			arr3[i].getDetails();
			}
		for(int i=0;i<5;i++) {
			arr3[i].displayDetails();
			}
	}

}
