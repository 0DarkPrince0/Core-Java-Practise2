package practise;
import java.util.LinkedList;
import java.util.Iterator;
public class Add<T>
{
	
	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("faheem");
		l.add("Ilahi");
		l.add("Imra");
		Iterator<String> itr=l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		l.remove("fahem");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
