package linkedList;

 class LinkedList<T>
{
	class Node
	{
		T data;
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
	public void delete(int position)
	{
		if(isEmpty())
		{
			System.out.println("Linked list is empty");
			
		}
		else
		{
			int i=1;
			current=start;
			while(current.next!=null)
			{
				previous=current;
				current=current.next;
				i=i+1;
			}
			
			if(i==position)
			{
				if(start==current)
				{
					start=null;
				}
				else
				{
					previous.next=current.next;
				}
			}
			System.out.println("Node is deleted");
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
