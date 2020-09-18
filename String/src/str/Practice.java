package str;

public class Practice 
{

	
	public static void main(String[] args) 
	{
		int decimal,i,k=0;
		int array[]=new int[50];
		System.out.println("Enter decimal number");
		decimal=new java.util.Scanner(System.in).nextInt();
		
		for(i=0;i<array.length;i++)
			
		{
			array[i]=decimal%2;
			decimal=decimal/2;
			k++;
			if(decimal==0)
			{
				break;
			}
		}
			for(i=k-1;i>=0;i--)
			{
				System.out.print(array[i]);
			}

	}

}
