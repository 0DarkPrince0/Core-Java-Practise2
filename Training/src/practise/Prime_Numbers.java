package practise;

public class Prime_Numbers {

	public static void main(String[] args) 
	{
		int i,j=2;
		int limit=21;
		int prime=0;
		boolean flag=true;
		while(limit!=0)
		{
			for(i=2;i<=j/2;i++)
			{
				prime=j%i;
				if(prime==0)
				{
					flag=false;
					break;
				}	
			}
			if(prime!=0)
			{
				System.out.println(j+"@");
				limit=limit-1;
			}
			else if(flag==true)
			{
				System.out.println(j+"*");
				limit=limit-1;
			}
			j=j+1;
		}
	}

}
