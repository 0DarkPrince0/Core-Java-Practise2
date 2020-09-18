package str;

public class Elipsis {

	public void add(int ...x)
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elipsis e=new Elipsis();
		e.add(2,3,4,5,6,7);
	}

}
