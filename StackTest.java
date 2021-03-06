import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void testCount() {
        Stack<Integer> Stack = new Stack<Integer>();
        Stack.push(4);
        Stack.push(5);
        Stack.push(6);

        assertEquals(3, Stack.count());
    }

    @Test
    void testPush() {
        Stack<Integer> Stack = new Stack<Integer>();
        Stack.push(4);

        assertEquals(4, Stack.peek());
    }

    @Test
    void testPull() {
        Stack<Integer> Stack = new Stack<Integer>();
        Stack.push(4);
        Stack.pull();

        assertEquals(true, Stack.isEmpty());
    }

    @Test
    void testIsEmpty() {
        Stack<Integer> Stack = new Stack<Integer>();
        Stack.push(4);

        assertEquals(false, Stack.isEmpty());

        Stack.pull();
        assertEquals(true, Stack.isEmpty());
    }

    @Test
    void testPeek() {
        Stack<Integer> Stack = new Stack<Integer>();
        Stack.push(4);
        Stack.push(5);
        Stack.push(6);

        assertEquals(6, Stack.peek());
    }
}