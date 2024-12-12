package Mastery;

import java.util.Scanner;

public class Gradebook {

	private int[][] grades;
	
	Scanner input = new Scanner(System.in);
	
	public GradeBook() {
		grades = new int[12][5];
		
	}
	
	public void GetGrades() {
		for (int student = 0; student < grades.length; student++){
			System.out.println("Enter student " + (student +1) + "'s grades:");
		
		for (int test = 0; test < grades[student].length; test++) {
			System.out.println("  Test " + (test + 1) + ": ");
			 grades[student][test] = input.nextInt();
		}
		}
		}
	
	public void showGrades() {
		
		System.out.println("Gradebook:");
		for (int student = 0; student < grades.length; student++) {
			
		}
		
	}
}
