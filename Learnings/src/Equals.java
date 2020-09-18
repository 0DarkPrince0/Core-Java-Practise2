import java.util.Scanner;
public class Equals 
{
	String name[]=new String[5];
	int i=0;
	public void setter(String name)
	{
		this.name[i]=name;
		this.i++;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Equals e=new Equals();
		Scanner scan=new Scanner(System.in);
		boolean b=false;
		System.out.println("Enter Five names");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Name"+(i+1)+":-");
			String name=scan.next();
			e.setter(name);
		}
		System.out.println("Enter your Search Name:-");
		String search=scan.next();
		
		for(int i=0;i<5;i++)
		{
			 if(e.name[i].equals(search))
		
			 {
			b=true;
			
			break;
			 }

		
		}
		if(b)
		System.out.println("found");
		else
			System.out.println("Not found");
	}

}
