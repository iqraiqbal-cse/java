import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Scanner;
public class crude {
    public static void main(String[] args) {
        ArraysList <string> fruits = new ArraysList<>();
        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");   
        fruits.add("Orange");
         fruits.add("Mango");
         // Access elements from the list
         System.out.println("Fruits: at index #2" + fruits.get(2));
         // Modify elements
            fruits.set(1, "Grapes");

        
        
        // Insert Elements
        fruits.add(index: 1, "kiwi");
        System.out.println("Fruits after insertion at index 1: " + fruits);
        // Remove Elements
        fruits.remove(0:"Orange");
        System.out.println("Fruits after removing Orange: " + fruits);
        // check if an element exists
        System.out.println("Contains Mango: " + fruits.contains("Mango"));
        // Get the size of the list
        System.out.println(" the Size of the list: " + fruits.size());
        // sort ArrayList
        Collections.sort(fruits);   
        System.out.println("After sorting: " + fruits);
        // Iterate in ArrayList-1
        for (String fruit : fruits) {
            System.out.println("Fruit: " + str);
        }
        // Iterate in ArrayList-2(using iterator/iterator method)
        Iterator<String> iteratorObject = fruits.iterator();
        while(iteratorObject.hasNext()) {
            System.out.println("Fruit: " + iteratorObject.next());
        }
        // Clear the list
        fruits.clear();
        System.out.println("After clear operation: " + fruits);
        // Check if the list is empty
        System.out.println("Is the list empty? " + fruits.isEmpty());
    }

}       

       