package Skillbuilder;

public class Square {
	public static void main(String[] args) 
	{
		int[] indexSquares = new int[5];
		

		for(int i = 0; i < 5; i++)
		{
			indexSquares[i] = i * i;
		}
		

		for(int i = 0; i < 5; i++)
		{
			System.out.println(indexSquares[i]);
		}
	}
}
