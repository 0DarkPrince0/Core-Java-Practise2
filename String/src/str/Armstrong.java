package str;
import java.util.Scanner;
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int number, sum=0,temp,r;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		number=scan.nextInt();
		temp=number;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(number==sum)
		{
			System.out.println("Enter number is armstrong");
		}
		else
			System.out.println("Number is not armstrong");
	}

}
