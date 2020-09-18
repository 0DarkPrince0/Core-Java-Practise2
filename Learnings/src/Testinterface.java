
public class Testinterface implements Printable,Showable
{

	/**
	 * @param args
	 */
	public void print()
	{
	System.out.println("Print");	
	}
	public void show()
	{
	System.out.println("Show");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testinterface t=new Testinterface();
		t.show();
		t.print();
	}
	}


