package assignment_1;

public class MinMax 
{
	public int max(int arr[])
	{
		int maximum=arr[0],i;
		for(i=0;i<arr.length;i++)
		{
		if(maximum<arr[i])
		{
			maximum=arr[i];
		}
		}
		return maximum;
	}
	
	
	public int min(int arr[])
	{ 
		int minimum=arr[0],i;
		for(i=0;i<arr.length;i++)
		{
		if(minimum>arr[i])
		{
			minimum=arr[i];
		}
		}
		return minimum;
	}
	
	
	public static void main(String[] args) 
	{
		int arr[]={1,2,11,2,5,3,7,9,4,4,13,8};
		int minimum,maximum;
		MinMax mm=new MinMax();
		maximum=mm.max(arr);
		minimum=mm.min(arr);
		System.out.println("Maximum Number:"+maximum);
		System.out.println("Minimum Number: "+minimum);
		
		
	}

}
