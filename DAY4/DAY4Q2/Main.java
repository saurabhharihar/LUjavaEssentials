package com.p3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int [] arr1=new int[5];
		for(short i=0;i<5;i++) {
		System.out.println(" Enter a value");
		arr1[i]=sc.nextInt();	
		}
		
		for(short i=0;i<4;i++) {
			if((arr1[i]%2)==0) {
			
			}
			else {
				System.out.println(arr1[i]+ " is an odd value ");
			}
		}
	}

}
