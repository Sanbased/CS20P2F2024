package Skillbuilder;

import java.util.Scanner;

public class StudentRoster {
	public static void main(String[] args) {
		  
		Scanner input = new Scanner(System.in);
		
        System.out.print("Please Enter the number of students in the class: ");
        int StudentNum = input.nextInt();
        input.nextLine();

      
        String[] studentName = new String[StudentNum];

        for (int i = 0; i < StudentNum; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentName[i] = input.nextLine();
        }

      
        System.out.println("\nStudent Roster");
        for (String name : studentName) {
            System.out.println(name);
        }

    }
}
