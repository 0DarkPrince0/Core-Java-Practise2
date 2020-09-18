package str;
import java.util.Scanner;

public class Addition 
{
	public static void addition(int a,int b)
	{
		{
		 int addition;
		 addition=a+b;
			System.out.println("Addition is= "+addition);
			}
	}
	public static void main(String[] args) 
	{
		int number1,number2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number= ");
		number1=scan.nextInt();
		System.out.println("Enter second number= ");
		number2=scan.nextInt();
		
		addition(number1,number2);
		scan.close();
		
	}

}
