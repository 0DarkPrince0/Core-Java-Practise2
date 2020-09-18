
public class StudentRecords 
{
	int roll;
	String name;
	static String college="PSIT";
	
	public void setvalue(int r, String n)
	{
		roll=r;
		name=n;
	}
	public void display()
	{
		System.out.println(roll);
		System.out.println(name);
		System.out.println(college);
		
	}
}

