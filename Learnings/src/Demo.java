
public class Demo 
{

	Demo(int x)
	{
		System.out.println("Constructor with One Argument");
	}
	Demo(int x,int y)
	{
		System.out.println("Constructor with 2 Arguments");
	}
	Demo()
	{
		super();
	}
	
	public static void main(String[] args) 
	{
		Demo d1=new Demo(10);
		Demo d2=new Demo(10,20);
		Demo d3=new Demo();

	}

}
