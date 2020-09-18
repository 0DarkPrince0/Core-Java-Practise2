package OnlineCart;

class LinkedList<T> implements Collection<T>,Iterator<T>
{
	class Node
	{
		T data;
		Node next;
	}
	private Node start,curr,prv;

	@Override
	public boolean isEmpty()
	{
		return start==null;
	}
	@Override
	public void add(T data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(isEmpty())
		{
			start=node;
		}
		else
		{
			curr=start;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=node;
		}
	}
	@Override
	public boolean remove(int pos)
	{
		if(isEmpty())
		{
			return false;
		}
		else
		{
			curr=start;
			int i=1;
			while(curr!=null && i!=pos)
			{
				prv=curr;
				curr=curr.next;
				i++;
			}
			if(i==pos)
			{
				if(start==curr)
				{
					start=curr.next;
				}
				else
				{
					prv.next = curr.next;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	@Override
	public Iterator iterator()
	{
		LinkedList<T> m = new LinkedList<T>();
		m.curr=this.start;
		return m;
	}
	@Override
	public boolean hasNext()
	{
		return this.curr!=null;
	}
	@Override
	public T next()
	{
		T temp;
		temp = this.curr.data;
		this.curr = this.curr.next;
		return temp;
	}
	@Override
	public void clean()
	{
		start=null;
	}
}