package LinkedList;

public class LinkedList 
{
	Node start,current,previous;
	public void addNode(Node node)
	{
		if(start==null)
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
	
	public void deleteAtEnd()
	{
		if(start==null)
		{
			System.out.println("LinkedList Empty");
		}
		else
		{
			current=start;
			while(current.next!=null)
			{
				previous=current;
				current=current.next;
			}
			previous.next=null;
			System.out.println("Node deleted");
		}
	}
	
	public void deleteAtStart()
	{
		if(start==null)
		{
			System.out.println("Linked List is empty");
		}
		else if(start.next==null)
		{
			start=null;
		}
		else
		{
				start=start.next;
		}
	}
	
	public void deletedByUser(int position)
	{
	
		if(start==null)
		{
			System.out.println("Linked List is empty");
		}
		else
		{
			int i=1;
			current=start;
			
				while(current!=null && i!=position)
				{
					previous=current;
					current=current.next;
					i++;
				}
				if(i==position)
				{
					if(start==current)
					{
						start=start.next;
					}
					else if(current==null)
					{
						System.out.println("Location not found");
					}
					else
					{
						previous.next=current.next;
					}
				
				}
				
				else
				{
					System.out.println("Locaiton not found");
				}
		}		
	}
	
	
	public void traverse()
	{
	if(start==null)
	{
		System.out.println("Linked List is empty");
	}
	else
	{
		current=start;
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.next;
		}
		
	}
	}
}
