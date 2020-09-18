package workingWithObject;

public class Second
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		First f=new First();
		First a=f;
		First b=a;
		f.x=1;
		f.y=2;
		System.out.println(f.x+" "+f.y);

		System.out.println(a.x);
		System.out.println(b.y);
	}

}
