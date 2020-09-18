
public class Bebo 
{


	public Bebo m1()
	{
		System.out.println("Hello Java");
		return this;		
	}
	public Bebo m2()
	{
		System.out.println("Welcome");
		return this;
	}
	public Bebo m3()
	{
		System.out.println("PSIT");
		return this;
	}
	
	public static void main(String[] args) 
	{
		new Bebo().m1();
		new Bebo().m2();
		new Bebo().m3();

	}

}
