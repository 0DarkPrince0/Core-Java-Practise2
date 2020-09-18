import java.util.*;
public class Check {


	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int range=12,i,j,array[],temp,coins,total=0,count=0;
	System.out.println("How many coins do you want to enter=");
	coins=scan.nextInt();
	array=new int[coins];
	System.out.println("Enter coins values:-");
	for(i=0;i<array.length;i++)
	{
		System.out.println("Enter Coin{"+(i+1)+"} value=");
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
	if(total<range)
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
		System.out.println("Unsufficient Coins");
	}
	else
		
	{
		System.out.println("Coins="+(count-1));
	}
	}


}
