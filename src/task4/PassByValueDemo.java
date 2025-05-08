package task4;

/**
 * This class demonstrates Java's pass-by-value behavior with both primitive and reference types.
 */
public class PassByValueDemo {
    public static void main(String[] args) {
        System.out.println("=== PRIMITIVE TYPES DEMONSTRATION ===");
        demonstratePrimitives();
        
        System.out.println("\n=== REFERENCE TYPES DEMONSTRATION ===");
        demonstrateReferences();
        
        System.out.println("\n=== VISUAL DEMONSTRATION ===");
        visualDemonstration();
    }
    
    /**
     * Demonstrates pass-by-value behavior with primitive types
     */
    public static void demonstratePrimitives() {
        // Create a primitive variable
        int x = 10;
        
        // Print its value before method call
        System.out.println("Before modifyPrimitive() call: x = " + x);
        
        // Call a method that attempts to modify it
        modifyPrimitive(x);
        
        // Print its value after method call to show it remains unchanged
        System.out.println("After modifyPrimitive() call: x = " + x);
    }
    
    /**
     * Attempts to modify a primitive value
     * @param value The primitive value to modify
     */
    public static void modifyPrimitive(int value) {
        System.out.println("Inside modifyPrimitive(): value before change = " + value);
        
        // Attempt to modify the parameter
        value = 100;
        
        System.out.println("Inside modifyPrimitive(): value after change = " + value);
        // When this method returns, the modified value is discarded
    }
    
    /**
     * Demonstrates pass-by-value behavior with reference types
     */
    public static void demonstrateReferences() {
        // Create a Person object and a reference to it
        Person person = new Person("John", 30);
        
        // Case 1: Show that object state can be modified through reference
        System.out.println("Before modifyObject() call: " + person);
        modifyObject(person);
        System.out.println("After modifyObject() call: " + person);
        
        // Case 2: Show that reassigning the reference doesn't affect original reference
        System.out.println("\nBefore reassignReference() call: " + person);
        reassignReference(person);
        System.out.println("After reassignReference() call: " + person);
    }
    
    /**
     * Modifies the state of an object through a reference
     * @param p The reference to the Person object
     */
    public static void modifyObject(Person p) {
        System.out.println("Inside modifyObject(): before change = " + p);
        
        // Modify the object's state
        p.setName("Jane");
        p.setAge(25);
        
        System.out.println("Inside modifyObject(): after change = " + p);
        // When this method returns, the changes to the object persist
    }
    
    /**
     * Attempts to reassign the reference
     * @param p The reference to the Person object
     */
    public static void reassignReference(Person p) {
        System.out.println("Inside reassignReference(): before reassignment = " + p);
        
        // Reassign the reference to a new Person object
        p = new Person("Bob", 40);
        
        System.out.println("Inside reassignReference(): after reassignment = " + p);
        // When this method returns, the reassignment is discarded
    }
    
    /**
     * Visual demonstration of Java's pass-by-value behavior
     */
    public static void visualDemonstration() {
        System.out.println("VISUAL DEMONSTRATION OF JAVA PASS-BY-VALUE");
        
        // Part 1: Visual for primitive types
        System.out.println("\nPART 1: PRIMITIVE TYPES");
        System.out.println("+-------------------+");
        System.out.println("|  main() Memory    |");
        System.out.println("+-------------------+");
        System.out.println("|  x = 10           |");
        System.out.println("+-------------------+");
        
        System.out.println("\nWhen modifyPrimitive(x) is called:");
        System.out.println("+----------------------+");
        System.out.println("|  modifyPrimitive()   |");
        System.out.println("+----------------------+");
        System.out.println("|  value = 10 (copy)   |");
        System.out.println("|  value = 100 (change)|");
        System.out.println("+----------------------+");
        
        System.out.println("\nAfter modifyPrimitive() returns:");
        System.out.println("+-------------------+");
        System.out.println("|  main() Memory    |");
        System.out.println("+-------------------+");
        System.out.println("|  x = 10 (unchanged)|");
        System.out.println("+-------------------+");
        
        // Part 2: Visual for reference types
        System.out.println("\nPART 2: REFERENCE TYPES");
        System.out.println("Heap Memory:  [Person Object: name=\"John\", age=30]");
        System.out.println("              ^ ");
        System.out.println("              |");
        System.out.println("+-----------------------------+");
        System.out.println("|  main() Memory              |");
        System.out.println("+-----------------------------+");
        System.out.println("|  person = (reference)-------|--->");
        System.out.println("+-----------------------------+");
        
        System.out.println("\nWhen modifyObject(person) is called:");
        System.out.println("Heap Memory:  [Person Object: name=\"John\", age=30]");
        System.out.println("              ^ ");
        System.out.println("              |");
        System.out.println("+-----------------------------+");
        System.out.println("|  modifyObject()            |");
        System.out.println("+-----------------------------+");
        System.out.println("|  p = (reference copy)-------|--->");
        System.out.println("+-----------------------------+");
        
        System.out.println("\nAfter changing object state:");
        System.out.println("Heap Memory:  [Person Object: name=\"Jane\", age=25]");
        System.out.println("              ^ ");
        System.out.println("              |");
        System.out.println("+-----------------------------+");
        System.out.println("|  main() Memory              |");
        System.out.println("+-----------------------------+");
        System.out.println("|  person = (reference)-------|--->");
        System.out.println("+-----------------------------+");
        
        System.out.println("\nPART 3: REFERENCE REASSIGNMENT");
        System.out.println("Heap Memory:  [Person Object 1: name=\"Jane\", age=25]   [Person Object 2: name=\"Bob\", age=40]");
        System.out.println("              ^                                          ^");
        System.out.println("              |                                          |");
        System.out.println("+-----------------------------+    +-----------------------------+");
        System.out.println("|  main() Memory              |    |  reassignReference()       |");
        System.out.println("+-----------------------------+    +-----------------------------+");
        System.out.println("|  person = (reference)-------|---> |  p = (reference)----------|----+");
        System.out.println("+-----------------------------+    +-----------------------------+    |");
        System.out.println("                                                                      |");
        System.out.println("                                                                      v");
        System.out.println("                                    After reassignment in method: p points to Object 2");
        
        System.out.println("\nAfter reassignReference() returns:");
        System.out.println("Heap Memory:  [Person Object 1: name=\"Jane\", age=25]   [Person Object 2: name=\"Bob\", age=40]");
        System.out.println("              ^                                          |");
        System.out.println("              |                                          |");
        System.out.println("+-----------------------------+                          |");
        System.out.println("|  main() Memory              |                          |");
        System.out.println("+-----------------------------+                          |");
        System.out.println("|  person = (reference)-------|---> (unchanged)          |");
        System.out.println("+-----------------------------+                          |");
        System.out.println("                                                         |");
        System.out.println("                                    p reference is lost -+");
    }
}
