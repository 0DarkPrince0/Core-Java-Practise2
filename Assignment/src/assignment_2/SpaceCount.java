package assignment_2;

public class SpaceCount {

	static public int spaceCount(String str)
	{
		int count=0,i;
		char ch[]=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str="Faheem  Ilahi";
		int spacecount;
		spacecount=SpaceCount.spaceCount(str);
		System.out.println("Space: "+spacecount);


	}

}
