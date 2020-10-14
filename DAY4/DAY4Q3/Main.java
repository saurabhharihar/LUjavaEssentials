package com.p4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		for(short i=0;i<4;i++)
		{	System.out.println(" Hey user enter a value ");
			arr[i]=sc.nextInt();
		}
		for(short i=0;i<4;i++){
			sum+=arr[i];
		}
		System.out.println(" Sum of the values entered is "+ sum );
	}

}
