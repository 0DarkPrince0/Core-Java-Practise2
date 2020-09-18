package practise;

public class SecondMaxx 
{

	int findSecMax(int arr[])
	{
		if(arr.length>0)
		{
			int max,max1;
			max = arr[0];
			max1=0;
			for(int i = 0; i<arr.length ; i++)
			{
				if(max<arr[i])
				{
					max1 = max;
					max = arr[i];
				}
			}
			return max1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		SecondMaxx sm=new SecondMaxx();
		System.out.println("Sec Max : "+sm.findSecMax(new int[]{213,10,22,33,1,12,23,54,21,32}));


	}

}
