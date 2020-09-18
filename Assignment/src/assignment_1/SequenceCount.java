package assignment_1;

public class SequenceCount 
{
	public void sequenceCount(int arr[])
	{
		int i,j,count;
		for(i=0;i<arr.length;i++)
		{
			count=0;
			for(j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if(arr[i]!=arr[j])
				{
					
					break;
				}
			}
		
			System.out.println(arr[i]+" Occ at "+count+" time" );
			i=j-1;
		}
	}

	
	public static void main(String[] args) 
	{
		int arr[]={1,2,1,1,1,2,2,2,3,3,3,2,2,4,4,4,5};
		SequenceCount sq=new SequenceCount();
		sq.sequenceCount(arr);
		
	}

}
