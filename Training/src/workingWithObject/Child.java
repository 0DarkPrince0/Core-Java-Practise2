package workingWithObject;
class Parent
{
	void show()
	{
		System.out.println("Parent show");
	}
	void get()
	{
		System.out.println("Parent get");
	}	
}
class Child extends Parent
{
	@Override
	void show()
	{
		System.out.println("Child show");
	}
	void disp()
	{
		System.out.println("Personal disp");
	}
	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.show();
		p.get();
		//p.disp();

		//Down casting

		Child c = (Child)p;
		c.disp();
	}

}
