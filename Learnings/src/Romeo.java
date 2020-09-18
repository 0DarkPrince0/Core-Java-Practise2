class Romeo1
{
	public void memo()
	{
		System.out.println("Method of class Romeo1");
		//return "method of class Romeo1";
	}
}
class Romeo2 extends Romeo1
{
	public void memo()
	{
		super.memo();
		System.out.println("Method of class Romeo2");
		//return "method of class Romeo2";
		
	}
}

public class Romeo extends Romeo2
{
	public void memo()
	{
	super.memo();
	System.out.println("Method of class Romeo");
//	return "method of class Romeo";
	}
	
	public static void main(String[] args) 
	{
		Romeo1 r1=new Romeo1();
		Romeo2 r2=new Romeo2();
		Romeo r=new Romeo();
		r1.memo();
		r2.memo();
		r.memo();
	}

}
