
public class Studentt 
{
	int roll,year;
	String name;
	Studentt()
	{
		roll=1;
		name="Faheem" ;
		year=99;
		}
	Studentt(int roll,String name, int year)
	{
		this.roll=roll;
		this.name=name;
		this.year=year;
	}
	void print()
	{
		System.out.println("Roll- "+roll);
		System.out.println("Name- "+name);
		System.out.println("Year- "+year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentt s1=new Studentt();
		s1.print();
		Studentt s2=new Studentt(2,"Ilahi",12);
		s2.print();
	}

}