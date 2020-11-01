
public class Doctor extends Employee{
private	int no_of_surgery_conducted;
private	String speciality;
	void getdetails() {
		System.out.println("Enter no of operations conducted");
		this.no_of_surgery_conducted=sc.nextInt();
		System.out.println("Enter speciality ");
		this.speciality=sc.nextLine();
	}
	void displaydetails() {
		System.out.println("No. of surgery :"+this.no_of_surgery_conducted);
		System.out.println("Speciality:"+this.speciality);
	
	}
}
