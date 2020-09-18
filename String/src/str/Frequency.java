package str;

public class Frequency {

	
	public static void main(String[] args) 
	{
		int array[]=new int[5];
		System.out.println("Enter elements= ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=new java.util.Scanner(System.in).nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				
					if(array[j]==array[i])
					{
						count++;
					}
			}
				System.out.print("Frequency of "+array[i]+"= ");
				System.out.println(count);
			
		}
	}

}
