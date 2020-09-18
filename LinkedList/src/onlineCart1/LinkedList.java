package onlineCart1;

public class LinkedList<T> implements Iterator<T>,Collection<T>
{
	class Node
	{
		T data;
		Node next;
	}
	
	
	
	Node start,current,previous;
	
	
	
	@Override
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



	@Override
	public boolean delete(int position) 
	{
		if(isEmpty())
		{
			return false;
		}
		else
		{
			int i=1;
			current=start;
			while(current.next!=null && i!=position)
			{
				previous=current;
				current=current.next;
				i++;
			}
			if(i==position)
			{
				if(start==current)
				{
					start=null;
					return true;
				}
				else if(current==null)
				{
					return false;
				}
				else
				{
					previous.next=current.next;	
					return true;
				}		
			}
			else
			{
				return false;
			}
		}
	}
	
	
	

	@Override
	public boolean isEmpty()
	{
		
		return start==null;
	}
	
	

	@Override
	public Iterator<T> iterator() 
	{
		LinkedList<T> m=new LinkedList<T>();
		m.current=this.start;
		return m;
	}
	@Override
	public boolean hasNext()
	{
		return this.current!=null;
	}
	
	@Override
	public T next()
	{
		T temp;
		temp=this.current.data;
		current=current.next;
		return temp;
	}	
	
	
	@Override
	public void clean() 
	{
		start=null;
		
	}
	
}
