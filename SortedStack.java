import java.util.Stack;
import java.util.Scanner;

/**
 * A program that accepts integers from user and inserts them 
 * into a stack sorted from smallest to largest (ascending order).
 * The smallest element will be at the top of the stack.
 * 
 * @author Nicole Giampapa
 * @version 1.0
 * @since 06/17/2025
 */
public class SortedStack {
    /**
    * Main class for the module setup.
    * @param args not used.
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> sortedStack = new Stack<>();
        
        System.out.println("This program takes integers you enter and stores them sorted smallest to largest.");
        System.out.println("\nEnter one integer at a time and hit Enter after each entry.");
        System.out.println("Type 'done' to finish.");

        while (true) {
            String input = scanner.next();

            if (InputValidator.isDone(input)){
                break;
            }

            if (InputValidator.isValidInteger(input)){
                int value = Integer.parseInt(input);
                SortElements.insertSorted(sortedStack, value);
            } else {
                System.out.println("Invalid input. Please enter an integer or 'done'.");
            }
        }
        System.out.println("Sorted stack using native print feature:" + sortedStack);
        System.out.println("Sorted stack (top to bottom):");

        Stack<Integer> tempStack = new Stack<>();
        // Transfer elements to temp stack and print
        while (!sortedStack.isEmpty()) {
            int value = sortedStack.pop();
            System.out.print(value + ", ");
            tempStack.push(value);
        }
        System.out.println("");

        // Restore the original stack
        while (!tempStack.isEmpty()) {
            sortedStack.push(tempStack.pop());
        }
        scanner.close();
    }
}
