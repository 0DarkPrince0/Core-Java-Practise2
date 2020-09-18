package WORK;
import java.util.Scanner;
public class Series1 
{

	
	public static void main(String[] args) 
	{
		int number,i,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Series Length");
		number=scan.nextInt();
		for(i=1;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.print("-"+i);
				sum=sum-i;
			}
			else
			{
				System.out.print("+"+i);
				sum=sum+i;
			}
		}
		System.out.println("\n Sum="+sum);
		
	}

}
