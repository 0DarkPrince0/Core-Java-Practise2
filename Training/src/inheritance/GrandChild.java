package inheritance;

public class GrandChild extends Child
{

	public void method()
	{
		System.out.println("Grandchild");
		
	}
	public static void main(String[] args)
	{
		GrandChild gc=new GrandChild();
		gc.method();
		
		Child gc1=new GrandChild();
		gc1.method();
		
		
	}	

}
