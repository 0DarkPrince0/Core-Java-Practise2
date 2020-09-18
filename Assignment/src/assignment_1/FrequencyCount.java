package assignment_1;

public class FrequencyCount {

	public void frequencyCount(int arr[])
	{
		int i,j,count;
		for(i=0;i<arr.length;i++)
		{
			count=0;
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]={1,2,1,1,1,2,2,2,3,3,3,2,2,4,4,4,5};
		
		FrequencyCount fc=new FrequencyCount();
		fc.frequencyCount(arr);
		
		
		/*1 occ at 4 time
		2 occ at 6 time
		3 occ at 3 times
		4 occ at 3 times
		5 occ at 1 time*/
	}

}
