package linkedList;

public class LinkedListIMP 
{

	
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.add("faheem");
		l.add('c');
		l.add(2.1);
		l.traverse();
		
		LinkedList1 ll=new LinkedList1();
		ll.add(10);
		ll.add("faheem");
		ll.traverse();
		
		LinkedList<String> a=new LinkedList<String>();
		a.add("faheem");
		a.add("Ilahi");
		a.traverse();
		
	}

}
