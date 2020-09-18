import java.util.LinkedList;
public class Linked_List {

	public static void main(String[] args) 
	{
		LinkedList <String> object=new LinkedList<String>();
		object.add("Faheem");
		object.add("Ilahi");
		object.add("Prince");
		object.addFirst("Khan");
		object.add(3,"Dark");
		object.addLast("Fozia");
		object.addFirst("Nagma");
		System.out.println(object);
		object.remove("Khan");
		object.removeLast();
		object.remove(1);
		int size=object.size();
		
		System.out.println(object);
		System.out.println(size);
		String s=object.getFirst();
		System.out.println(s);
		String s1=object.get(2);
		System.out.println(s1);
		object.set(2, "Gul");
		System.out.println(object);
		
	}

}
