package com.p2;
import java.util.Scanner;
public class L2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1;
		int m2;
		int m3;
		int m4;
		int m5;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter marks of 1st subject ");
		m1=sc.nextInt();
		System.out.println(" Enter marks of 2nd subject ");
		m2=sc.nextInt();
		System.out.println(" Enter marks of 3rd subject ");
		m3=sc.nextInt();
		System.out.println(" Enter marks of 4th subject ");
		m4=sc.nextInt();
		System.out.println(" Enter marks of 5th subject ");
		m5=sc.nextInt();
		double percentage=0 ;
		if(m1<=100 && m2<=100 && m3<=100 && m4<=100 && m5<=100 && m1>=0 && m2>=0 && m3>=0 && m4>=0 && m5>=0 ) {
		
		percentage = m1+m2+m3+m4+m5;
		percentage/=500;
		percentage*=100;
		System.out.println(" For entered marks percentage is : "+ percentage);
		}
		else {
			System.out.println(" You entered INCORRECT data , !!! Please try again !!!");
		}
		double t=percentage;
		if (t>0 && t<40)
		{
			System.out.println(" Grade obtained is : C grade ");
		}
		else if(t>=40 && t<75) {
			System.out.println(" Garde obtained is : B grade ");
		}
		else if(t>=75 )
		{
			System.out.println(" Grade obtained is : A garde ");
		}
		else {
			System.out.println(" Error please try again !!! ");
		}
	}
}
