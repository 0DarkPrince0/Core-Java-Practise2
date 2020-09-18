import java.util.Scanner;


public class Demo1 
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First number");
		int n=scan.nextInt();
		System.out.println("Enter 2nd number");
		int m=scan.nextInt();
		System.out.println("Addition of these numbers=");
		Demo1.add(n,m);
		
			
	}

}
