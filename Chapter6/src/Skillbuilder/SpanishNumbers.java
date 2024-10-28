package Skillbuilder;

public class SpanishNumbers {
    
public static void SpanNumbers(int num) {
  
	String[] numbersInSpanish = {" 1 uno"," 2 dos"," 3 tres"," 4 cuatro"," 5 cinco"," 6 seis"," 7 siete"," 8 ocho"," 9 nueve"," 10 diez"};

	System.out.println(numbersInSpanish[num]);
}

public static void main(String args[]) { 
	for (int i = 0; i <= 9; i++){ 
		 SpanNumbers(i); 
    }
		   }
}

	

