import java.util.Scanner;


public class Prime 
{


	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number to check weather the number is prime or not");
		int number=scan.nextInt();
		if((number==2)||(number==3)||(number==5)||(number==7)||(number==11))
			System.out.println("Number is prime");
		else if(((number%2)==0)||((number%3)==0)||((number%5)==0)||((number%7)==0)||((number%11)==0))
		{
			System.out.println("Number is not Prime");
		}
		else
		{
			
			System.out.println("Number is prime");
		}
	}

}
