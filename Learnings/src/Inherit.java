
import java.util.Scanner;
class Inherit implements D
{
	public void add(int a ,int b)
	{
		int c=a+b;
		System.out.println("Addition is= "+c);
	}
	public void sub(int a , int b)
	{
		int c=a-b;
		System.out.println("Subtraction is= "+c);
	}
	public void mul(int a ,int b)
	{
		int c=a*b;
		System.out.println("Multiplication is= "+c);
	}
	public void div(int a ,int b)
	{
		int c=a/b;
		System.out.println("Dividation is= "+c);
	}
	public static void main(String a[])
	{
		Inherit in=new Inherit();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter First Number= ");
		int num1=scan.nextInt();
		System.out.println();
		System.out.print("Enter 2nd Number= ");
		int num2=scan.nextInt();
		System.out.println();
		in.add(num1, num2);
		in.sub(num1, num2);
		in.mul(num1, num2);
		in.div(num1, num2);
	}
}