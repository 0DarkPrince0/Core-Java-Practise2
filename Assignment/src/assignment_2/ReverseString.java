package assignment_2;

public class ReverseString 
{
	static public String reverse(String str)
	{
		int i;

		String str1=" ";
		char ch[]=str.toCharArray();
		for(i=ch.length-1;i>=0;i--)
		{
			str1=str1+ch[i];
		}
		return str1;
	}
	
	public static void main(String[] args)
	{
		String str="Faheem  Ilahi";
		String str1;
		str1=ReverseString.reverse(str);
		System.out.println("Reverse String: "+str1);

	}

}
