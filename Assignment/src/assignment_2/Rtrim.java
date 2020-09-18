package assignment_2;

public class Rtrim {
	static public String rtrim(String str)
	{
		

		int i;

		String str1="";
		char ch[]=str.toCharArray();

		for(i=ch.length-1;i>=0;i--)
		{
			if(ch[i]==' ' && str1=="")
			{
				continue; 
			}
			else
			{
				str1=str1+ch[i];
			}
		}
		
		str=str1;
		str1="";
		for(i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		return str1;
	}

	public static void main(String[] args)
	{
		String str="    good morning india    ";
		String str1=Rtrim.rtrim(str);
		System.out.println(str);
		System.out.println(str1);
		
	}
}
