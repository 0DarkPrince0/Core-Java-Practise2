import java.util.*;
public class LargestCoin
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int coins,array[],i,j,temp=0,total=0,count=0,range=20;
		System.out.println("How many numbers do you want to enter");
		coins=scan.nextInt();
		array=new int[coins];
		
		for(i=0;i<array.length;i++)
		{
			System.out.println("Enter the value of Number "+(i+1));
			array[i]=scan.nextInt();
		}
		for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
	
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		for(i=0;i<array.length;i++)
		{
			count=count+1;
			if(total<range )
			{
			total=total+array[i];
			}
			else
			{
				break;
			}
			
		}
		if(total<range)
		{
			System.out.println("Unsufficient coins");
		}
		else
		{
		System.out.println("for total "+range+" "+ " we needed coins "+(count-1));
		}
	}

}
