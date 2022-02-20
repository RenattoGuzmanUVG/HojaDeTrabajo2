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

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return vector.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return vector.isEmpty();
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return vector.get(0);
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return vector.remove(0);    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        vector.add(0, value);
    }

    
}
