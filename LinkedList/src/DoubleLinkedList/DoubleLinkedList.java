package DoubleLinkedList;

public class DoubleLinkedList 
{
	Node start,current,back;
	void add(Node node)
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

			node.previous=current;
			current.next=node;	
		}
	}
	
	void delete(int position)
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			current=start;
			int i=1;
			while(current!=null && i!=position)
			{
				back=current;
				current=current.next;
				i++;
			}
			if(position==i)
			{
				if(start==current)
				{
					start=start.next;
				}
				else if(current==null)
				{
					System.out.println("Position not found");
				} 
				else
				{
					back.next=current.next;
					if(current.next!=null)
					{
					current=current.next;
					current.previous=back;
					}
				}
		
			}
			else
			{
				System.out.println("Position not found");
			} 
			
		}
	}
	
	public void traverse()
	{
		if(start==null)
		{
			System.out.println("List Empty...");
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
