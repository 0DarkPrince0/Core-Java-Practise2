
public class ForEach 
{

	public int maximum(int array[])
	{
		int large=array[0];
		for(int maxx : array)
		{
			if(large>maxx)
			{
				continue;
			}
			else
			{
				large=maxx;
			}
		}
		return large;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("How many numbers do you want to enter:- ");
		int range,array[],max,i;
		range=new java.util.Scanner(System.in).nextInt();
		array=new int[range];
		System.out.println("Enter Numbers");
		for(i=0;i<array.length;i++)
		{
			System.out.println("Enter Number "+(i+1));
			array[i]=new java.util.Scanner(System.in).nextInt();
		}
		ForEach fe=new ForEach();
		max=fe.maximum(array);
		System.out.println("Max number is "+max);
		
	}

}
