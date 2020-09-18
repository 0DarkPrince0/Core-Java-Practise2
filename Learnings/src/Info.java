import java.util.Scanner;


public class Info
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Student Roll Number");
		Stu s1=new Stu();
		while(( a=scan.nextInt())!=0)
		{
		System.out.println("Enter the Student Name");
		String b=scan.next();
		
		s1.setvalue(a,b);
		s1.display();
		System.out.println("Enter the Student Roll Number");
		}
	}

}

class Stu
{
	int roll;
	String name;
	String college="PSIT";

	public void setvalue(int r,String n)
	{
	roll=r;
	name=n;
	
	}
	public void display()
	{
		System.out.println("Student Roll:- "+roll+" Sudent Name:- "+name+" College:- "+college);
		
	}
}
