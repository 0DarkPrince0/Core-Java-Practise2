import java.util.Scanner;


public class StudentStructure 
{
	int roll[]=new int[100];
	String name[]=new String[100];
	int subjectMarks[]=new int[100];
	static int i=0;
	
	
	public void setter(int roll,String name)
	{
		this.roll[i]=roll;
		this.name[i]=name;
		i++;
		
		
	}
	public void getter()
	{
		System.out.println("Roll Number= "+roll);
		System.out.println("Name= "+name);
		
	}
	
	public static void main(String[] args) 
	{
		StudentStructure s=new StudentStructure();
		Scanner scan=new Scanner(System.in);
		int r;
		String n;
		System.out.println("Number of Students= ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Roll Number:-");
			r=scan.nextInt();
			System.out.println("Enter the Name:-");
			n=scan.nextLine();
			s.setter(r, n);
		}
	}

}
