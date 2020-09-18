package assignment_1;

public class ArrayDemo
{
	public void print(int arr[])
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Element"+(i+1)+" : "+arr[i]);
		}
	}
	public int[] reverse(int arr[])
	{
		int i,j,temporary=0;
	
			i=0;
			j=arr.length-1;
			while(i<j)
			{
				temporary=arr[i];
				arr[i]=arr[j];
				arr[j]=temporary;
				i++;
				j--;
			}
			return arr;
		
	}

	public static void main(String[] args) 
	{
		ArrayDemo ad = new ArrayDemo();
		int arr[] = new int []{2,3,4,5,6,7};
		ad.reverse(arr);
		
		ad.print(arr);



		//ad.print(ad.reverse(new int[]{1,2,3,4,5,6,7}));

		//int arr[]=ad.reverse(new int[]{1,2,3,4,5,6,7});
		//ad.print(arr);
	}
	

}
