package str;
public class FindMin 
{
	private void min(int array[])
	{
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
			
		}
		System.out.println("Minimum Number is="+min);
	}
	
	public static void main(String[] args) 
	{
		//Scanner scan=new Scanner(System.in);
		int limit,i,array[];
		System.out.println("How many numbers do you want to enter");
		limit=new java.util.Scanner(System.in).nextInt();
		array=new int[limit];
		for(i=0;i<array.length;i++)
		{
			array[i]=new java.util.Scanner(System.in).nextInt();
		}
		FindMin fm=new FindMin();
		fm.min(array);
	}

}
