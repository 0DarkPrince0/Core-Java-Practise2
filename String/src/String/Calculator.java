package String;
import java.util.Scanner;
public class Calculator
{

	
	public static void main(String[] args)
	{
		int number1,number2,choice;
		char ch;
		Scanner scan=new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the first number=");
			number1=scan.nextInt();
			System.out.println("Enter the Second number=");
			number2=scan.nextInt();
			System.out.println("Enter your choice=");
			System.out.println("Press 1 for Addition:");
			System.out.println("Press 2 for Subtraction:");
			System.out.println("Press 3 for Multiplication:");
			System.out.println("Press 4 for Divide:");
			
			choice=scan.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				int addition=number1+number2;
				System.out.println("Addition="+addition);
				break;
			}
			case 2:
			{
				int subtraction=number1-number2;
				System.out.println("Subtraction="+subtraction);
				break;
			}
			case 3:
			{
				int multiplication=number1*number2;
				System.out.println("Multiplication="+multiplication);
				break;
			}
			case 4:
			{
				int dividation=number1/number2;
				System.out.println("Dividation="+dividation);
				break;
			}
			}
		System.out.println("Do you want to Continue Press (Y/N)");
		ch=scan.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
		System.gc();
	}
	
	

}
