
/**
 * @author moises.alonso
 *
 */
public interface InterfazStack<T> {

	void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();
}