package practise;

public class SecondMax
{

	
	public static void main(String[] args) 
	{
		int array[]={5,4,3,2,1};
		int max1,max2,i;
		max1=array[0];
		max2=0;
		for(i=0;i<array.length;i++)
		{
			if(max1>max2)
			{
				if(max2<array[i])
				{
					if(max1<array[i])
					{
						max2=max1;
						max1=array[i];
					}
					else if(max1==array[i])
					{
						continue;
					}
					else
					{
						max2=array[i];
					}
				}
			}
			else if(max1<max2)
			{
				int temp=0;
				temp=max1;
				max1=max2;
				max2=temp;
			}
			else if(max1==max2)
			{
				max1=array[i];
			}
		
		}
		System.out.println(max1);
		System.out.println(max2);
		
	}

}
