package practise;


public class UniqueAndOccurrence
{
	public String seprate(String str1)
	{
		String str2="";
		int i=0;
		for(i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='.' || str1.charAt(i)==',')
			{
				str2=str2+" "+str1.charAt(i);		
			}
			else
			{
				str2=str2+str1.charAt(i);
			}	
		}
		return str2;	
	}
	
	
	
	
	public String unique(String str1)
	{
		String str2="";
		int i,j;
		String str[]=str1.split(" ");
		
		for(i=0;i<str.length;i++)
		{
			for(j=0;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					if(i!=j)
					{
						str[j]=" ";
					}
				}		
			}
		}
		for(i=0;i<str.length;i++)
		{
			if(str[i]!=" ")
			{
				str2=str2+str[i]+" ";
			}
		}
		return str2;
	}
	
	
	
	
	public void occurrence(String unique,String separate)
	{
		String str1[]=unique.split(" ");
		String str2[]=separate.split(" ");
		int count,i,j;
		for(i=0;i<str1.length;i++)
		{
			count=0;
			for(j=0;j<str2.length;j++)
			{
				if(str1[i].equalsIgnoreCase(str2[j]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("Word:- "+str1[i]+":"+count+" time.");
			}
			else
			{
				System.out.println("Word:- "+str1[i]+":"+count+" times.");
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		UniqueAndOccurrence uao=new UniqueAndOccurrence();
		String str1="Hello Candidate, send your resume. Resume should be in PDF format.";
		String separate="";
		String unique="";
		separate=uao.seprate(str1);
		unique=uao.unique(separate);
		uao.occurrence(unique,separate);
	}

}
