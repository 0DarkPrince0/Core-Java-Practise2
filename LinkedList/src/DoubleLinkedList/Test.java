package DoubleLinkedList;



public class Test 
{


	public static void main(String[] args)
	{
		DoubleLinkedList list = new DoubleLinkedList();
		Node node1=new Node();
		node1.setData(10);
		Node node2=new Node();
		node2.setData(20);
		Node node3=new Node();
		node3.setData(30);
		
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.traverse();
		list.delete(4);
		list.traverse();
	
	}

}
