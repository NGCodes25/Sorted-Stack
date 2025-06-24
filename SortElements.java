import java.util.Stack;

/**
 * Provides methods for inserting integers into a Stack in sorted order.
 * Sort order is from smallest to largest.
 */
public class SortElements {
    /**
     * Inserts a value into the Stack in the correct position to keep it sorted.
     * Stack will be in ascending order.
     * The smallest element on the top of the stack
     * 
     * @param stack the stack this method inserts into
     * @param value the integer value to insert in sorted order
     */
    public static void insertSorted(Stack<Integer> stack, int value) {
        //if stack is empty or value is smaller than first element
        if (stack.isEmpty() || value <= stack.peek()) {
            stack.push(value);
        } else {
            // Remove the top item and insert the element
            int top = stack.pop();
            insertSorted(stack, value);
            stack.push(top);
        }
    }

}