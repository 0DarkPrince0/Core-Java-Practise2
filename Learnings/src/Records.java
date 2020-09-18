import java.util.Scanner;


public class Records {
	int roll;
	String name;
	public void set(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Roll Number:- "+roll);
		System.out.println("Name:- "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		Records s[]=new Records[5];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Roll number");
			int n=scan.nextInt();
			System.out.println("Enter Name");
			String r=scan.next();
			s[i]=new Records();
			s[i].set(n, r);
			s[i].display();
			
			
		}
	}

}
