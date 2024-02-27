import java.util.ArrayList;
import java.util.Collections;

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Printing the ArrayList
        System.out.println("Original ArrayList:");
        printArrayList(fruits);

        // Adding an element at a specific index
        fruits.add(2, "Grapes");

        // Printing the ArrayList after adding an element
        System.out.println("\nArrayList after adding 'Grapes' at index 2:");
        printArrayList(fruits);

        // Removing an element by value
        fruits.remove("Orange");

        // Printing the ArrayList after removing an element by value
        System.out.println("\nArrayList after removing 'Orange':");
        printArrayList(fruits);

        // Removing an element by index
        fruits.remove(0);

        // Printing the ArrayList after removing an element by index
        System.out.println("\nArrayList after removing element at index 0:");
        printArrayList(fruits);

        // Accessing elements by index
        System.out.println("\nElement at index 1: " + fruits.get(1));

        // Checking if an element exists
        System.out.println("Does 'Mango' exist in the ArrayList? " + fruits.contains("Mango"));

        // Replacing an element at a specific index
        fruits.set(1, "Pineapple");

        // Printing the ArrayList after replacing an element
        System.out.println("\nArrayList after replacing element at index 1 with 'Pineapple':");
        printArrayList(fruits);

        // Sorting the ArrayList
        Collections.sort(fruits);

        // Printing the sorted ArrayList
        System.out.println("\nSorted ArrayList:");
        printArrayList(fruits);

        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + fruits.isEmpty());

        // Clearing the ArrayList
        fruits.clear();

        // Printing the ArrayList after clearing it
        System.out.println("\nArrayList after clearing:");
        printArrayList(fruits);
    }

    // Method to print the elements of an ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
