import java.util.*;

/**
 * Stack
 * @param <T>
 * @author Renatto Guzmán
 */
public class Stack<T> implements InterfazStack<T>{

    private Vector<T> vector;

    public Stack() {
        vector = new Vector<T>();
    }

        /**
     * 
     * @return tamaño del vector
     */
    @Override
    public int count() {
        return vector.size();
    }
    /**
     * 
     * @return si está vacio el vector true, si no false
     */
    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
    /**
     * 
     * @return T, primera posición del vector
     */
    @Override
    public T peek() {
        return vector.get(0);
    }
    /**
     * 
     * @return T, el vector sin la primera posición
     */
    @Override
    public T pull() {
        return vector.remove(0);    }

    /**
     * 
     * @param value valor a meter en el stack
     */
    @Override
    public void push(T value) {
        vector.add(0, value);
    }

    
}
