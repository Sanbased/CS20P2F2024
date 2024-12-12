package Mastery;

import java.util.Scanner;

public class CourseGrades {
	public static void main(String[] args) {
		
		
		Gradebook studentgrades = new Gradebook();
		
		
		studentgrades.GetGrades();
		
		
		studentgrades.ShowGrades();
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please Enter which student (1-12) average you want to see: ");
		int studentnumber = input.nextInt();
		System.out.println("Student " + studentnumber + "'s average is:" 
		+ studentgrades.studentaverage(studentnumber) + "%");
		
		
		System.out.println("Please enter the test (1-5) average you would like to see:");
		int testnumber =  input.nextInt();
		System.out.println(" Test number " + testnumber + "'s average is:" 
				+ studentgrades.testaverage(testnumber) + "%");
		
	}
}
