package OnlineCart;

interface Collection<T>
{
	boolean isEmpty();
	void add(T data);
	boolean remove(int pos);
	Iterator iterator();
	void clean();
}