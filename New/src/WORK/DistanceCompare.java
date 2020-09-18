package WORK;

public class DistanceCompare
{
	public void compare()
	{
		Distance x=new Distance();
		Distance y=new Distance();
		int first=x.getDistance();
		int second=y.getDistance();
		System.out.println(first);
		System.out.println(second);
		if(first>second)
		{
			System.out.println("first distance is longer");
		}
		else if(first<second)
		{
			System.out.println("second distance is longer");
		}
		else
			System.out.println("Both are equal");
			
	}
}
