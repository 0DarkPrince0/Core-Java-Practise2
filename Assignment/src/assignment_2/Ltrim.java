package assignment_2;

public class Ltrim {

	static public String ltrim(String str)
	{
		

		int i;

		String str1="";
		char ch[]=str.toCharArray();

		for(i=0;i<ch.length;i++)
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
		return str1;
	}
	public static void main(String[] args) 
	{
		String str="    good morning india    ";
		String str1=Ltrim.ltrim(str);
		System.out.println(str);
		System.out.println(str1);
		
		
	}

}
