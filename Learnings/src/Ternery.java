import java.util.Scanner;


public class Ternery 
{

public static void largest()
{
	int num1,num2,num3,large,largest;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first Number");
	num1=scan.nextInt();
	System.out.println("Enter 2nd Number");
	num2=scan.nextInt();
	System.out.println("Enter 3rd Number");
	num3=scan.nextInt();
	large=((num1>num2)?num1 : num2);
	largest=((large>num3)? large : num3);
	System.out.println("Largest= "+largest );
}
	public static void main(String[] args) 
	{
		Ternery.largest();
	}

}
