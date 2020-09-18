package assignment_2;

public class Palindrome 
{
	static public boolean palindrome(String str)
	{
		boolean flag=true;
		int i,j;
		char ch[]=str.toCharArray();
		j=ch.length-1;
		for(i=0;i<ch.length;i++)
		{
			 
		if(j>=0)
		{
			if(ch[i]==ch[j])
			{
				System.out.println(i+" "+j+" "+flag);
				 if(i==j)
				{
					break;
				}
			}	
			else
			{
				flag=false;
				System.out.println(i+" "+j+flag);
				break;
			}
		}
		j--;
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		String str="faheem";
		boolean palindrome;
		palindrome=Palindrome.palindrome(str);
		if(palindrome)
		{
		System.out.println("Yes! String is palindrome: ");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
	}

}
