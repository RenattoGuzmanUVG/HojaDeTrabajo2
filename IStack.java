
/**
 * @author moises.alonso
 *
 */
public interface IStack<T> {

    /**
     * 
     * @param value valor a meter en el stack
     */
	void push(T value);
	
    /**
     * 
     * @return T, el vector sin la primera posición
     */
	T pull();
	
    /**
     * 
     * @return T, primera posición del vector
     */
	T peek();
	
    /**
     * 
     * @return tamaño del vector
     */
	int count();
    
    /**
     * 
     * @return si está vacio el vector true, si no false
     */
	boolean isEmpty();
}