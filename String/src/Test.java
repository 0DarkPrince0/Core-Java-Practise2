
public class Test 
{

	public static void foo(int itr)
	{
		System.out.println(itr);
		if(itr==5)
		{
			return;
		}
		int i;
		for(i=0;i<5;i++)
		{
			
			System.out.println(i +"&"+ itr);
			
			foo(itr+1);
		}
	}
	public static void main(String[] args) 
	{
		
		
		Test.foo(0);
	}

}
