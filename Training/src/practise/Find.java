package practise;

public class Find 
{
	public boolean find(int setA[],int setB[])
	{
		int i,j;
		boolean flag=false;
		for(i=0;i<setB.length;i++)
		{
			for(j=0;j<setA.length;j++)
			{
				if(setB[i]==setA[j])
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
				
			}
			if(flag)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		Find f=new Find();
		int setA[]={1, 2, 4, 5, 7, 9};
		int setB[]={4,7};
		System.out.println(f.find(setA, setB));
	}
}
