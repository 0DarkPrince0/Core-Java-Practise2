import java.util.Scanner;
public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int choice,number1,number2;
		char ch;
		System.out.print("Enter the first number=");
		number1=scan.nextInt();
		System.out.println();
		System.out.println("Enter the 2nd number=");
		number2=scan.nextInt();
		System.out.println();
		do
		{
			
			
		System.out.println("Now Enter Your Choice=");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for exit");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:
		{
			int addition=number1+number2;
			System.out.println("Addtion="+addition);
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
			int division;
			division=number1/number2;
			System.out.println("Division="+division);
			break;
		}
		
		}
		System.out.println("Do you want to countinue (Y/N)");
		ch=scan.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
			
	}
}


