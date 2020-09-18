package linkedList;

public class LinkedList1<T>
{
	class Node
	{
		 private T data;
		Node next;
	}
	Node start,current,previous;
	boolean isEmpty()
	{
		return start==null;
	}
	
	public void add(T data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(isEmpty())
		{
			start=node;
		}
		else
		{
			current=start;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=node;
		}
	}
	
	public void traverse()
	{
		
		if(isEmpty())
		{
			System.out.println("Linked List is empty");
			
		}
		else
		{
			current=start;
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			
			
		}
	}
}
