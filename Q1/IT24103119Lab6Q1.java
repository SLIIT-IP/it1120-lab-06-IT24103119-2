import java.util.Scanner;

public class IT24103119Lab6Q1
{
	public static void main(String[] args)
	{
	Scanner brand = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	double number = brand.nextDouble();
	
	double square = number*number;

	if(number > 0)
		{
		double square_root = Math.sqrt(number);
		
		System.out.println("The square of " + number + " is :" + square);
		System.out.print("The square root of " + number + " is :" + square_root);

		}
	}
}