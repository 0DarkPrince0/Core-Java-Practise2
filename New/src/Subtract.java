	import java.util.Scanner;

	public class Subtract 
	{
	
		public static void main(String[] args) 
		{
			int number1,number2,subtract;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first number= ");
			number1=scan.nextInt();
			System.out.println("Enter second number= ");
			number2=scan.nextInt();
			subtract=number1-number2;
			System.out.println("subtraction= "+subtract);
			
		}

	}

