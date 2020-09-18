
public class Find {

	static void minimum(int m[])
	{
		int min=m[0];
		for(int i=1;i<m.length;i++)
		{
			if(min>m[i])
			{
				min=m[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myarr[]=new int[]{9,4,6,3,2};
		Find.minimum(myarr);
	}

}
