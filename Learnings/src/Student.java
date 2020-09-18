
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Records s1=new Records();
		Records s2=new Records();
		Records s3=new Records();
		
		s2.setvalue(2,"Arif");
		s3.setvalue(3, "Firoz");
		
		s2.display();
		s3.display();
s1.college="fafd";
s1.setvalue(1,"Amir");
s1.display();
	}

}
 class Records 
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


