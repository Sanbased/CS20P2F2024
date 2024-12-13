 /*

Program: Gradebook.java        Date: Dec 12th 2024

Purpose: Support CourseGrades Class with the methods that store grades, prompts/prints grades, and calculates test/student averages.

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;

public class Gradebook {
	
	//two dimensional array that stores the grades for 12 students, including 5 different tests
	private int[][] grades;
	
	// Constructor method
	//initialize the 2D grades array with 12 students with 5 tests each
	public Gradebook() {
		grades = new int[12][5];
	}
	
	//method loops through each of the 12 students and asks user to enter the 5 test marks for each student. 
	// values are stored in the array
	public void GetGrades() {
		Scanner input = new Scanner(System.in);
		for (int student = 0; student < grades.length; student++){
			System.out.println("Enter student " + (student +1) + "'s grades:");
		
		for (int test = 0; test < grades[student].length; test++) {
			System.out.println("  Test " + (test + 1) + ": ");
			 grades[student][test] = input.nextInt();
		}
		}
		}//
	
	//method loops through the 5 test values for each student and prints them 
	public void ShowGrades() {
		
		System.out.println("Gradebook:");
		for (int student = 0; student < grades.length; student++) {
			System.out.println("Student" + (student + 1) + ":");
		
		for (int test = 0; test < grades[student].length; test++) {
			System.out.println(grades[student][test] + "");
		}
		System.out.println("");
		}
	}
	
	//method used to calculate the average for a certain test 1-5. 
	public double testaverage(int testnum) {
		int testi = testnum -1;
		
		int sum = 0;
		
		for (int student = 0; student < grades.length; student++) {
			sum+= grades[student][testi];
		}
		return (double) sum / grades.length;
	}
	
	// method calculates the average for a certain student, 1-12. 
	public double studentaverage(int studentnum) {
		int studenti = studentnum -1;
		
		int sum = 0;
		
		for (int test = 0; test < grades[studenti].length; test++) {
			sum+= grades[studenti][test];
		}
		return (double) sum / grades[studenti].length;
	}
	
}
// Please refer to main CourseGrades Class for the test case.