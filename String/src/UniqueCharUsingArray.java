import java.util.Scanner;
public class UniqueCharUsingArray 
{


	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str;
		int i,j,count,k=0;
		System.out.println("Enter the string");
		str=scan.next();
		char array[],array1[];
		array=str.toCharArray();
		int len=array.length;
		System.out.println(len);
		array1=new char[len];
		for(i=0;i<array.length;i++)
		{
			count=0;
			for(j=0;j<i;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}	
			}
			if(count==0)
			{
				array1[k]=array[i];
				k++;
			}
		
		}
		for(i=0;i<k;i++)
		{
			System.out.print(array1[i]);
		}
	}

}
