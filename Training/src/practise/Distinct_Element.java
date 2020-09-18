package practise;

public class Distinct_Element {

	public static void main(String[] args) 
	{
		int arr[] = {10, 20, 20, 10, 30, 10};
		
		
		int i,j;
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					if(i!=j)
					{
						arr[j]=0;
					}
				}
				
			}
		}
		System.out.print("Distinct Numbers are:- ");
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
