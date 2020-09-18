package assignment_2;

public class WordCount 
{

	static public int wordCount(String str)
	{
		int wordcount=0,i;
		char ch[]=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
		if(((ch[i]<='a') || (ch[i]<='A')) || ((ch[i]>='z') || (ch[i]>='Z')))
		{
			wordcount=wordcount+1;
		}
			/*if(ch[i]==' ')
			{
				continue;
			}
			else
			{
				wordcount=wordcount+1;
			}*/
		}
		return wordcount;
	}
	public static void main(String[] args) 
	{
		String str="Faheem Ilahi";
		int wordcount;
		wordcount=WordCount.wordCount(str);
		System.out.println("Word Count: "+wordcount);

	}

}
