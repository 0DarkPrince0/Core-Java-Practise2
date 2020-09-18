import java.util.Scanner;


public class Factorial 
{

	public static void main(String[] args) 
	{
		int number,fact;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=scan.nextInt();
		fact=factorial(number);
		System.out.println("Factorial= "+fact);

	}
	public static int factorial(int num)
	{
		if((num==1)||(num==0))
		{
			return 1;
		}
		
			return num*factorial(num-1);
		
		
	}

}
