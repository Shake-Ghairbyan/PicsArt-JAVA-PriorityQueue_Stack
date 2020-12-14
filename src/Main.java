import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------Priority Queue-----------------------");
        Collection<String> c = new ArrayList<String>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new DescOrderStringComparator());
        priorityQueue.add("JavaScript");
        priorityQueue.add("Java");
        priorityQueue.add("C++");
        priorityQueue.add("C#");
        priorityQueue.add("Python");
        priorityQueue.add("Ruby");
        priorityQueue.add("Rust");
        System.out.println("Will print in alphabetic order.");
        System.out.println("Head of Queue: " + priorityQueue.peek());
        System.out.println("Removing current head of queue: " + priorityQueue.poll());
        System.out.println("Removing current head of queue: " + priorityQueue.poll());
        System.out.println("Removing current head of queue: " + priorityQueue.poll());
        priorityQueue.add("Java");
        System.out.println("Removing current head of queue: " + priorityQueue.poll());
        priorityQueue.add("Android");
        System.out.println("Removing current head of queue: " + priorityQueue.poll());
        priorityQueue.add("Android");
        priorityQueue.add("Java");
        System.out.println("Removing current head of queue: " + priorityQueue.poll());
        priorityQueue.add("Angular");
        priorityQueue.add("ReactJS");
        priorityQueue.add("Laravel");
        priorityQueue.add("PHP");
        priorityQueue.add("Android");
        priorityQueue.add("Android");
        System.out.println("Current Queue elements: " + priorityQueue);
        System.out.println("Printing elements in descending order.");
        priorityQueue.offer("Something");
        System.out.println("Without Sorting");
        System.out.println(priorityQueue);
        StringJoiner strj = new StringJoiner(" ");
        while (!priorityQueue.isEmpty()) {
            strj.add(priorityQueue.poll());
        }
        System.out.println("With Sorting in Descending Order");
        System.out.println(strj);

        System.out.println("----------------------Stack-----------------------");
        Stack<String> stringStack = new Stack<>();
        stringStack.push("MacBookPro");
        stringStack.push("ChromeBook");
        stringStack.push("MiBand5");
        stringStack.push("Fitbit");
        stringStack.push("MacBookAir");
        System.out.println("Is StringStack Empty?: " + (stringStack.empty() ? "Yes" : "No"));
        System.out.println("Currently the top element of the stack /last input/: " + stringStack.peek());
        String firstEl = stringStack.firstElement();
        System.out.println("First /to be last/ element in the stack: " + firstEl);
        while (!stringStack.empty()) {
            String poppedEL = stringStack.pop();
            if (firstEl.compareTo(poppedEL) == 0) {
                System.out.println("First input/Last output: " + firstEl);
            } else {
                System.out.println("Popping top element from stack: " + poppedEL);
            }
        }
        stringStack.empty();
        System.out.println("Is StringStack Empty?: " + (stringStack.empty() ? "Yes" : "No"));
    }
}
