import java.util.*;
public class PrimeNumber 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int number,i;
		boolean flag=true;
		System.out.println("Enter the Number:-");
		number=scan.nextInt();
		if(number==0 || number==1)
		{
			flag=false;
		}
		
		for(i=0;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Number is prime");
		}
		
	}

}
