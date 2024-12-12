package Mastery;

import java.util.Scanner;

public class Gradebook {
	
	private int[][] grades;
	
	public Gradebook() {
		grades = new int[12][5];
	}
	
	public void GetGrades() {
		Scanner input = new Scanner(System.in);
		for (int student = 0; student < grades.length; student++){
			System.out.println("Enter student " + (student +1) + "'s grades:");
		
		for (int test = 0; test < grades[student].length; test++) {
			System.out.println("  Test " + (test + 1) + ": ");
			 grades[student][test] = input.nextInt();
		}
		}
		}
	
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
	
	public double testaverage(int testnum) {
		int testi = testnum -1;
		
		int sum = 0;
		
		for (int student = 0; student < grades.length; student++) {
			sum+= grades[student][testi];
		}
		return (double) sum / grades.length;
	}
	
	public double studentaverage(int studentnum) {
		int studenti = studentnum -1;
		
		int sum = 0;
		
		for (int test = 0; test < grades[studenti].length; test++) {
			sum+= grades[studenti][test];
		}
		return (double) sum / grades[studenti].length;
	}
	
}
