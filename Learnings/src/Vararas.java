
public class Vararas
{
	public void add(int ...x)
	{
		int temp=0,i;
		for(i=0;i<x.length;i++)
		{
			temp=temp+x[i];
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) 
	{
		Vararas v=new Vararas();
		v.add(1,2);
		v.add(1);
		v.add(1,2,3);
		System.gc();
	}

}
