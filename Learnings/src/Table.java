import java.util.Scanner;


public class Table 
{

	public static void table(int x)
	{
		System.out.println("Table of "+x+" is");
		for(int i=1; i<=10; i++)
		{
			System.out.print(x+"x"+i+"=");
			System.out.println(x*i);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number for the Table= ");
		int n=scan.nextInt();
		Table.table(n);
		
	}

}
