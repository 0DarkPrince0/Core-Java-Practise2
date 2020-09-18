package assignment_2;

public class DigitCount 
{
	static public int digitCount(String str)
	{

		char ch[]=str.toCharArray();
		
		int count=0,i;
		for(i=0;i<str.length();i++)
		{
			if(ch[i]==' ')
			{ 
				continue;
			}
			
			if(ch[i]>=48 || ch[i]<=57)
			{
				count++;
			System.out.println(count);
			}
			
		}

		return count;
	}
	
	public static void main(String[] args) 
	{
		String str="12354 4";
		int digitcount;
		digitcount=DigitCount.digitCount(str);
		System.out.println("Digit Count: "+digitcount);

	}

}
