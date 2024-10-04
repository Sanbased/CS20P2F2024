package CRT;
import java.util.Scanner;

public class Ch4CRTwork {

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("please enter your number.");
		int number = userInput.nextInt();
		 
		switch (number % 2) { 
		case 0: System.out.println("even number"); 
		break; 
		
		case 1: System.out.println("odd number"); 
		break;
		}
		
	}
}
		
	
	

	

