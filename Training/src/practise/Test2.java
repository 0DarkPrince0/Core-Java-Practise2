package practise;

class Test2
{
	int sum(int a)
	{
		if(a<10)
		{
			return -1;
		}
		if(a<30)
		{
			return 0;
		}
		else
		{
			System.out.println("else");	
		}
		return 1;
	}
	public static void main(String...s)
	{
		System.out.println(new Test2().sum(11));
	}
}