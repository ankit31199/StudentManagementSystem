package StudentManagementApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses="";
	private int tutionBalance;
	private static int cost=600;
	private static int id=1913000;
	
	public Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's First Name:");
		this.firstName=sc.nextLine();
		System.out.println("Enter Student's Last Name:");
		this.lastName=sc.nextLine();
		System.out.println("Enter Student's Year \n 1 for Freshman \n 2 for Sophomore \n 3 for Junior \n 4 for Senior ");
		this.gradeYear=sc.nextInt();
		
		setStudentId();
	}
	
	private void setStudentId()
	{
		//gradeLevel+ID
		id++;
	
	    this.studentId= gradeYear+""+id;
	}
	
	public void enroll()
	{
		do {
		System.out.println("Enter courses to enroll and Q to quit");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equalsIgnoreCase("Q"))
			{
			courses=courses+"\n"+course;
			tutionBalance=tutionBalance+cost;
			}
		else
			break;
		}while(1!=0);
	}
	
	public void viewBalance()
	{
		System.out.println(tutionBalance);
	}
	public void payTutionBalance()
	{
		viewBalance();
		System.out.println("Enter your Payment:");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		tutionBalance-=payment;
		System.out.println(payment);
		viewBalance();
	}
	public String showInfo()
	{
		return "Name:" +firstName+" "+lastName+ 
				"\n Year: "+ gradeYear +
				"\n Student ID: "+studentId+
				"\n Courses Enrolled: "+courses+
				"\n Balance: " +tutionBalance;
				
	}
	
		
}


