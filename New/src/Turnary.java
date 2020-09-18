import java.util.Scanner;
public class Turnary 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int age1;
		int age2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first person age");
		age1=scan.nextInt();
		System.out.println("Enter 2nd person age");
		age2=scan.nextInt();
		int min=(age1<age2 ? age2:age1);
		if(age1==age2)
		{
			System.out.println("Both person are at same age");
			
		}
		else if(min==age2)
		{
			System.out.println("2nd person is elder");
		}
		else if(min==age1)
		{
		System.out.println("1st Person is elder");
		}
		
			
	}
		

}
