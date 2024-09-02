import java.util.Scanner;

public class IT24103119Lab6Q2C
{
	public static void main(String[] args)
	{
	Scanner brand = new Scanner(System.in);
	
	System.out.println("Enter number 1: ");
	int D = brand.nextInt();
	
	System.out.println("Enter number 2: ");
	int J = brand.nextInt();
	
	System.out.println("Enter number 3: ");
	int C = brand.nextInt();
	
	System.out.println("Enter number 4: ");
	int O = brand.nextInt();
	
	System.out.println("Enter number 5: ");
	int E = brand.nextInt();
	
	System.out.println("Enter number 6: ");
	int R = brand.nextInt();
	
	System.out.println("Enter number 7: ");
	int S = brand.nextInt();
	
	System.out.println("Enter number 8: ");
	int T = brand.nextInt();
	
	System.out.println("Enter number 9: ");
	int e = brand.nextInt();
	
	System.out.println("Enter number 10: ");
	int d = brand.nextInt();

	System.out.println("The enumbers you entered are : "+D+" "+J+" "+C+" "+O+" "+E+" "+R+" "+S+" "+T+" "+e+" "+d+" ");

	int sum = D+J+C+O+E+R+S+T+e+d;
	System.out.println("Sum of the numbers : " + sum);
	
	double average = sum/10;
	System.out.print("Average of the numbers : " + average);
	
	}
}