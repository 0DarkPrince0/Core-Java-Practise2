package assignment_1;

public class _2DArray_MinMax_Number 
{
	public int maximum(int arr[][])
	{
		int i,j,maximum=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				if(maximum<arr[i][j])
				{
					maximum=arr[i][j];
				}
			}	
		}
		return maximum;
	}
	
	
	public int minimum(int arr[][])
	{
		int i=0,j=0,minimum=arr[0][0];
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				if(minimum>arr[i][j])
				{
					minimum=arr[i][j];
					System.out.println(minimum);
				}
			}	
		}
		return minimum;
	}
	
	public static void main(String[] args) 
	{
		int array[][]={{1,4,3},{5,2,6},{9,3,8}};
		_2DArray_MinMax_Number d=new _2DArray_MinMax_Number();
		System.out.println("Maximum :"+d.maximum(array));
		System.out.println("Minimum :"+d.minimum(array));
		
	}

}
