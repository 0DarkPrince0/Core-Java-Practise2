package workingWithObject;

class ChildBase extends Base
{
	@Override
	void show()
	{
		System.out.println("Child show");
	}
	public static void main(String[] args) 
	{
		Base cb = new ChildBase();
		
		cb.show();
		cb.get();
	}

}
abstract class Base
{
	abstract void show();

	void get() 
	{
		System.out.println("Base get");
	}	
}