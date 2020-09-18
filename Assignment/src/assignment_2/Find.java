package assignment_2;

public class Find 
{
	static public int find(String str1, String str2)
	
	{
		int i;
		String array[]=str1.split(" ");
		for(i=0;i<array.length;i++)
		{
			if(array[i].equalsIgnoreCase(str2))
			{
				System.out.println("Found at Index: "+i);
				return i;
			}
		}
		
		
		
		
		return -1;
		//index if present otherwise -1;
	}

	public static void main(String[] args) 
	{
		int index;
		String	str1="good morning india";
		String	str2="india";
		index=Find.find(str1,str2);
		if(index==-1)
		{
			System.out.println("Not found: "+index);
		}
	
	}

}
