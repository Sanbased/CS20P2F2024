package Skillbuilder;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) 
	{ 
    Scanner input = new Scanner(System.in);


    //Declare the variables
    String Hname;
    int Hcategory;

    //Introduction message explaining the program to the user
    System.out.println("This program will display the Hurricane Category and its windspeeds!");
    System.out.println("The windspeed you enter must be a number over 74 MPH, or else it does not fall under any hurricane categories.");
   
    //prompt user for name of the hurricane 
     System.out.println("please enter the name of the Hurricane:");
        Hname = input.nextLine();

    // prompt user for a hurricane category and store in Hcategory variable
    System.out.println("Please enter the Hurricane speed in MPH:");
        Hcategory = input.nextInt();
    
    //(if) loop statements for the program to decide which category the entered speed fits in
     if (Hcategory >= 74 && Hcategory <= 95 ){
        System.out.println("Hurricane " + Hname + " falls under Category 1 windspeeds: 74-95 MPH, 64-82 KT, 119-153 KM/H");
        }
     if (Hcategory >= 96 && Hcategory <= 110 ){
        System.out.println("Hurricane " + Hname + " falls under Category 2 windspeeds: 96-110 MPH, 83-95 KT, 154-177 KM/H");
     }
     if (Hcategory >= 111 && Hcategory <= 130 ){
        System.out.println("Hurricane " + Hname + " falls under Category 3 windspeeds: 111-130 MPH, 96-113 KT, 178-209 KM/H");
     }
     if (Hcategory >= 131 && Hcategory <= 155 ){
        System.out.println("Hurricane " + Hname + " falls under Category 4 windspeeds: 131-155 MPH, 114-135 KT, 210-249 KM/H");
     }
     if (Hcategory >= 155){
        System.out.println("Hurricane " + Hname + " falls under Category 5 windspeeds: Greater than 155 MPH, 135 KT, 249 KM/H");
     }
     //error statement if the entered value doesn't fit in any of the 5 categories
     else if (Hcategory < 74){
          System.out.println("Error, please enter a integer number greater than 74 MPH");
        }
    }
}
	

