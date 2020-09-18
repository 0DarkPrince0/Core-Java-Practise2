package onlineCart1;

public interface Collection<T>
{
	boolean isEmpty();
	void add(T data);
	boolean delete(int pos);
	Iterator <T> iterator();
	void clean();
}
