package assignment_2;

public class FrequencyCount 
{
	static public void frequencyCount(String str)
	{
		int i,j,count;
		char ch[]=str.toCharArray();
		for(i=0;i<ch.length;i++)
			//String str="iiinnddddiiaa";
		{
			count=0;				
			
			if(i!=0 && i+1<ch.length && ch[i]==ch[i+1] )
			{
				continue;
			}
			if(i-1!=-1 && ch[i]==ch[i-1] && i!=0 && ch[i]==ch[i+1])
			{
				continue;
			}
			for(j=0;j<ch.length;j++)
			{
				
					if(ch[i]==ch[j])
					{
						count++;
					}
			}
			

			System.out.println(ch[i]+" occ at "+count+" times");
		}
	}
	
	
	public static void main(String[] args) 
	{
		String str="iiinnddddiiiaa";
		FrequencyCount.frequencyCount(str);
	}

}
