package practise;

public class Test4 
{


	 int age;
	public void setAge(int age)
	{
		if(age<18)
		{
			try
			{
				throw new Exception("Invalid Age");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			this.age=age;
		}
	}
	public static void main(String...s)
	{
		new Test4().setAge(20);
		System.out.println(new Test4().age);
		//Test4 t=new Test4();
	//	t.setAge(25);
	//	System.out.println(t.age);
	}

}
