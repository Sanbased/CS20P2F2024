 /*

Program: CourseGrades.java        Date: Dec 12th, 2024

Purpose: see the average grades of students, or the average grade on a test

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;

public class CourseGrades {
	public static void main(String[] args) {
		
		//create an instance of Gradebook class
		//Object studentgrades can be used to call methods from Gradebook class
		Gradebook studentgrades = new Gradebook();
		
		//call GetGrades method, which prompts user to enter all the student grades then stores the values in the gradebook
		studentgrades.GetGrades();
		
		//call ShowGrades method, which displays all the grades of the students in the gradebook
		studentgrades.ShowGrades();
		
		//prepare scanner for userinput
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter which student's average they want to see
		System.out.println("Please Enter which student (1-12) average you want to see: ");
		
		//user input is stored in variable called studentnumber
		int studentnumber = input.nextInt();
		
		//print the student's average by calling the studentaverage method from Gradebook class
		System.out.println("Student " + studentnumber + "'s average is:" 
		+ studentgrades.studentaverage(studentnumber) + "%");
		
		
		//prompt user to enter which test's average they would like to see
		System.out.println("Please enter the test (1-5) average you would like to see:");
		
		//user input is stored in testnumber variable
		int testnumber =  input.nextInt();
		
		//print the test's average by calling the testaverage method from Gradebook class
		System.out.println(" Test number " + testnumber + "'s average is:" 
				+ studentgrades.testaverage(testnumber) + "%");
		
	}
}
/* Screen Dump

Test Case 1:
Enter student 1's grades:
  Test 1: 
98
  Test 2: 
76
  Test 3: 
89
  Test 4: 
78
  Test 5: 
76
Enter student 2's grades:
  Test 1: 
95
  Test 2: 
86
  Test 3: 
75
  Test 4: 
47
  Test 5: 
85
Enter student 3's grades:
  Test 1: 
67
  Test 2: 
97
  Test 3: 
42
  Test 4: 
56
  Test 5: 
87
Enter student 4's grades:
  Test 1: 
98
  Test 2: 
94
  Test 3: 
57
  Test 4: 
68
  Test 5: 
79
Enter student 5's grades:
  Test 1: 
65
  Test 2: 
82
  Test 3: 
68
  Test 4: 
56
  Test 5: 
93
Enter student 6's grades:
  Test 1: 
56
  Test 2: 
92
  Test 3: 
45
  Test 4: 
67
  Test 5: 
81
Enter student 7's grades:
  Test 1: 
92
  Test 2: 
49
  Test 3: 
62
  Test 4: 
83
  Test 5: 
83
Enter student 8's grades:
  Test 1: 
45
  Test 2: 
94
  Test 3: 
38
  Test 4: 
38
  Test 5: 
27
Enter student 9's grades:
  Test 1: 
49
  Test 2: 
28
  Test 3: 
98
  Test 4: 
98
  Test 5: 
98
Enter student 10's grades:
  Test 1: 
67
  Test 2: 
56
  Test 3: 
67
  Test 4: 
87
  Test 5: 
65
Enter student 11's grades:
  Test 1: 
89
  Test 2: 
75
  Test 3: 
46
  Test 4: 
34
  Test 5: 
76
Enter student 12's grades:
  Test 1: 
45
  Test 2: 
99
  Test 3: 
99
  Test 4: 
99
  Test 5: 
60
Gradebook:
Student1:
98
76
89
78
76

Student2:
95
86
75
47
85

Student3:
67
97
42
56
87

Student4:
98
94
57
68
79

Student5:
65
82
68
56
93

Student6:
56
92
45
67
81

Student7:
92
49
62
83
83

Student8:
45
94
38
38
27

Student9:
49
28
98
98
98

Student10:
67
56
67
87
65

Student11:
89
75
46
34
76

Student12:
45
99
99
99
60

Please Enter which student (1-12) average you want to see: 
3
Student 3's average is:69.8%
Please enter the test (1-5) average you would like to see:
5
 Test number 5's average is:75.83333333333333%


 */