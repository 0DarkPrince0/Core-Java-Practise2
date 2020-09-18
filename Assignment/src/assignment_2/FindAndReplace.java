package assignment_2;

public class FindAndReplace 
{
	static public boolean findAndReplace(String str,String findStr,String replaceStr)
	{
		int i;
		String str1="";
		boolean flag=false;
		String array[]=str.split(" ");
		
		for(i=0;i<array.length;i++)
		{
			if(array[i].equalsIgnoreCase(findStr))
			{
				str1=str1+replaceStr+" ";
				flag=true;
			}
			else
			{
				str1=str1+array[i]+" ";
			}
			
		}

	

		//String str1 = "good morning uk and usa";

		//String str2 = "uk";

		//String str3 = "india";
		System.out.println(str1);
		return flag;
		
	}
	
	public static void main(String[] args) 
	{
		boolean flag=true;
		String str="good morning india";
		String findstr="morning1";
		String replacestr="evening";
	//	FindAndReplace.findAndReplace(str,findstr,replacestr);
		if(flag==FindAndReplace.findAndReplace(str,findstr,replacestr))
				{
					
				}
		else
		{
			System.out.println("Word not fond");
		}
			
	}

}
