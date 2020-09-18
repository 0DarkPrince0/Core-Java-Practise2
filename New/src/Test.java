import java.util.Scanner;
public class Test 
{

	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int array[]=new int[5],i,number;
		boolean flag=false;
		System.out.println("Enter 5 numbers:-");
		
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Number{"+(i+1)+"}=");
			array[i]=scan.nextInt();
		}
		
		System.out.println("Enter the number you want to search:-");
		number=scan.nextInt();
		
		for(i=0;i<5;i++)
		{
			if(array[i]==number)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Number "+number+" is found at location "+(i+1));
		}
		else
		{
			System.out.println("Number is not found");
		}
	}

}
