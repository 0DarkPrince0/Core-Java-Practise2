package DoubleLinkedList;

public class Node 
{
	Node previous;
	private int data;
	Node next;
	
	//getter and setter
	public void setData(int data)
	{		
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
}
