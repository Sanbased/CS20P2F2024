package CRT;
import java.util.Scanner;
import java.util.Random;

public class Ch4CRTwork {

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		
		 int AGE;

		
		System.out.println("Please enter your age:");
		 AGE = userInput.nextInt();
		
		 if (AGE < 18) {
			    System.out.println("Child");

			} else  {
			    if (AGE >= 18) {

			        if (AGE < 65) {
			            System.out.println("Adult");

			        } else {
			            System.out.println("Senior");
			        }
			    }
			}
	}
}
			        

		
		
	

		
	
	

	

