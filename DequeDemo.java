import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        deque.addFirst("First");
        deque.addFirst("Second");
        deque.addFirst("Third");

        // Adding elements to the end of the deque
        deque.addLast("Last");

        System.out.println("Deque: " + deque);

        // Removing elements from the front and end of the deque
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();

        System.out.println("Removed from the front: " + removedFirst);
        System.out.println("Removed from the end: " + removedLast);

        System.out.println("Updated Deque: " + deque);

        // Peeking at the elements at the front and end of the deque
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Check if the deque contains an element
        boolean containsSecond = deque.contains("Second");
        System.out.println("Contains 'Second': " + containsSecond);

        // Size of the deque
        int size = deque.size();
        System.out.println("Size of the deque: " + size);
    }
}
