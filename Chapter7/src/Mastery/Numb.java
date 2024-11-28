package Mastery;

public class Numb {

	
		private int num;
		
		
		public Numb (int number) {
			num = number;
		}
		
		
		public int whole() {
			return num;
		}
		
		
		public int ones() {
			return num%10;
		}
		
		
		public int tens() {
			return (num/10)%10;
		}
		
		
		public int hund() {
			return (num/100)%10;
		}
}
