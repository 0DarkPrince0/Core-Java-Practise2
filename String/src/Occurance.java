import java.util.Scanner;
public class Occurance 
{

	
	public static void main(String[] args)
	{
		String str1,str2="";
		int len,i,j,count;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		str1=scan.next();
		len=str1.length();
		for(i=0;i<len;i++)
		{
			count=0;
			for(j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				str2=str2+str1.charAt(i);
			}
		}
		System.out.println(str2);
		
		System.out.println("Occurace of each character=");
		
		for(i=0;i<str2.length();i++)
		{
			count=0;
			for(j=0;j<str1.length();j++)
			{
				
				if(str2.charAt(i)==str1.charAt(j))
				{
					count++;
				}
			}

			System.out.println("Character "+str2.charAt(i)+"="+count);
		}
	}

}
