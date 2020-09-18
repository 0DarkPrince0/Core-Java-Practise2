class Base
{
	public static void mum()
	{
		System.out.println("static method of Base Class");
		
	}
	public void mum1()
	{
		System.out.println("Non static method of Base class");
		
	}
}
public class Derived extends Base
{
	public static void mum()
	{
		System.out.println("Static method of Derived class");
		
	}
	public  void mum1()
	{
		System.out.println("Non static method of Derived class");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Base b1=new Derived();
		b1.mum1();
		b1.mum();
		b1.mum();
		b1.mum1();
		
	}

}
