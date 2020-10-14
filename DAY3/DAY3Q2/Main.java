package com.p3;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			Employee e1=new Employee();
			System.out.println(" Enter employee's name ");
			e1.name=sc.nextLine();
			System.out.println(" Enter monthly salary ");
			e1.sal_mon=sc.nextDouble();
			System.out.println(" Enter date of birth ( Enter between 1 to 31 )");
			e1.dob=sc.nextInt();
			System.out.println(" Enter month of birth ( Enter between 1 to 12) ");
			e1.mob=sc.nextInt();
			System.out.println(" Enter year of birth ");
			e1.yob=sc.nextInt();
			LocalDate today = LocalDate.now();
		//	System.out.println(today.getYear());
			e1.age=today.getYear()-e1.yob;
			e1.sal_ann=e1.sal_mon*12;
			if(e1.sal_ann>=200000 && e1.sal_ann<300000) {
				e1.tax=0.05*e1.sal_ann;
			}
			else if(e1.sal_ann>=300000 && e1.sal_ann<400000)
			{
				e1.tax=0.1*e1.sal_ann;
			}
			else if(e1.sal_ann>=400000 && e1.sal_ann<500000) {
				e1.tax=0.15*e1.sal_ann;
			}
			else if(e1.sal_ann>=500000) {
				e1.tax=0.2*e1.sal_ann;
			}
			e1.display();
			
	}

}
