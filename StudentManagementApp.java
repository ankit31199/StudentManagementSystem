package StudentManagementApp;
import java.util.*;

	public class StudentManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter number of new students to enroll");
		Scanner sc=new Scanner(System.in);
		int numberOfStudents=sc.nextInt();
		Student[] studentsArray=new Student[numberOfStudents];
		
		for(int i=0;i<numberOfStudents;i++)
		{
			System.out.println("Enter "+i++ +" Student details:");
			i--;
			studentsArray[i]=new Student();
			studentsArray[i].enroll();
			studentsArray[i].payTutionBalance();
			System.out.println(studentsArray[i].showInfo());
			
		}
		

	}
	
	

}
