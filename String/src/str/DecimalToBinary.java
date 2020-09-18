package str;
import java.util.Scanner;
public class DecimalToBinary 
{


	public static void main(String[] args) 
	{
		int decimal,array[]=new int[50],i=0,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		decimal=scan.nextInt();
		
		for(i=0;i<array.length;i++)
		{
			array[i]=decimal%2;
			decimal=decimal/2;
			count++;
			if(decimal==0)
			{
				break;
			}
		}
		for(i=count-1;i>=0;i--)
		System.out.print(array[i]);
		
		}

}
