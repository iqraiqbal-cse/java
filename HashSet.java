// public class interface Players {
//      void play();  
// }


// abstract class SportsPerson {
//     String name;
//     int age;

//     SportsPerson(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }


// class Cricketer extends SportsPerson implements Players {

//     Cricketer(String name, int age) {
//         super(name, age);
//     }

//     @Override
//     public void play() {
//         System.out.println(name + " is playing Cricket 🏏");
//     }
// }


// class Footballer extends SportsPerson implements Players {

//     Footballer(String name, int age) {
//         super(name, age);
//     }
//    @Override
//     public void play() {
//         System.out.println(name + " is playing Football ⚽");
//     }
// }


// public class Main {
//     public static void main(String[] args) {
        
//         Cricketer c1 = new Cricketer("Virat Kohli", 35);
//         c1.displayInfo();
//         c1.play();

//         System.out.println();

        
//         Footballer f1 = new Footballer("Lionel Messi", 38);
//         f1.displayInfo();
//         f1.play();
//     }
// }
    
import java.util.*;
public class HashSet Demo {
    public static void main(String[] args) {
        {
        HashSet<String> hashSet;long\ = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Apple"); // Duplicate element, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Checking if an element exists
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // Removing an element
        set.remove("Orange");
        System.out.println("After removing Orange: " + set);

        // Iterating through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}''

