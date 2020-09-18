package assignment_2;

public class SequenceCount 
{
	static public void sequenceCount(String str)
	{
		int i,j,count;
		char ch[]=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			count=0;
			//"iiinnddddiiaa"
			
			for(j=0;j<ch.length;j++)
			{
				if(i<=j)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
					else
					{
						break;
					}
				}
			}
			i=j-1;
			System.out.println(ch[i]+" occ at "+count+" times");
		}
	}

	public static void main(String[] args) 
	{
		String str="iiinnddddiiaa";
		SequenceCount.sequenceCount(str);
		//System.out.println(SequenceCount.sequenceCount(str));
		
		/*i occ at 3 times
		n occ at 2 times
		d occ at 4 times
		i occ at 2 times
		a occ at 2 times */
	}

}
