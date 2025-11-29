public class Employee {
     String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child class Manager
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // Call parent constructor
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Child class Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create Manager object
        Manager m1 = new Manager("Alice", 80000, "IT");
        System.out.println("Manager Details:");
        m1.displayInfo();

        System.out.println();

        // Create Developer object
        Developer d1 = new Developer("Bob", 60000, "Java");
        System.out.println("Developer Details:");
        d1.displayInfo();
    }

    
}
