package task4;

/**
 * This class provides a visual demonstration of Java's pass-by-value behavior.
 */
public class PassByValueVisual {
    public static void main(String[] args) {
        System.out.println("=== VISUAL DEMONSTRATION OF JAVA PASS-BY-VALUE ===");
        
        // Part 1: Create a visual representation of pass-by-value for primitive types
        visualPrimitivesDemo();
        
        // Part 2: Create a visual representation of pass-by-value for reference types
        visualReferencesDemo();
        
        // Part 3: Create a visual representation of reference reassignment
        visualReferenceReassignmentDemo();
    }
    
    /**
     * Visual demonstration of pass-by-value with primitives
     */
    private static void visualPrimitivesDemo() {
        System.out.println("\nPART 1: PRIMITIVE TYPES");
        
        int x = 10;
        System.out.println("In main(): int x = " + x);
        
        System.out.println(
            "\n" +
            "Memory in main():                Memory in changePrimitive():\n" +
            "+--------------+                 +--------------+\n" +
            "| main() scope |                 |              |\n" +
            "+--------------+                 +--------------+\n" +
            "| x = 10       |    --copy-->    | y = 10       |\n" +
            "+--------------+                 +--------------+\n"
        );
        
        changePrimitive(x);
        
        System.out.println(
            "\n" +
            "After changePrimitive() returns:\n" +
            "+--------------+\n" +
            "| main() scope |\n" +
            "+--------------+\n" +
            "| x = 10       | (unchanged)\n" +
            "+--------------+\n"
        );
        
        System.out.println("In main() after call: x = " + x);
    }
    
    /**
     * Visual demonstration of pass-by-value with reference types
     */
    private static void visualReferencesDemo() {
        System.out.println("\nPART 2: REFERENCE TYPES");
        
        Person p = new Person("Alice", 30);
        
        System.out.println("In main(): Person p = " + p);
        
        System.out.println(
            "\n" +
            "Memory Layout Before Method Call:\n" +
            "+--------------------+             +--------------------+\n" +
            "| Heap Memory        |             | Stack Memory       |\n" +
            "+--------------------+             +--------------------+\n" +
            "| Person Object      | <--ref--    | main():            |\n" +
            "| name = \"Alice\"     |             | p = [reference]    |\n" +
            "| age = 30           |             |                    |\n" +
            "+--------------------+             +--------------------+\n"
        );
        
        modifyPersonObject(p);
        
        System.out.println(
            "\n" +
            "Memory Layout After Method Call:\n" +
            "+--------------------+             +--------------------+\n" +
            "| Heap Memory        |             | Stack Memory       |\n" +
            "+--------------------+             +--------------------+\n" +
            "| Person Object      | <--ref--    | main():            |\n" +
            "| name = \"Alice\"     |             | p = [reference]    |\n" +
            "| age = 40           | (changed)   |                    |\n" +
            "+--------------------+             +--------------------+\n"
        );
        
        System.out.println("In main() after modifyPersonObject(): p = " + p);
    }
    
    /**
     * Visual demonstration of reference reassignment
     */
    private static void visualReferenceReassignmentDemo() {
        System.out.println("\nPART 3: REFERENCE REASSIGNMENT");
        
        Person p = new Person("Bob", 25);
        
        System.out.println("In main(): Person p = " + p);
        
        System.out.println(
            "\n" +
            "Memory Layout Before reassignPerson():\n" +
            "+--------------------+             +--------------------+\n" +
            "| Heap Memory        |             | Stack Memory       |\n" +
            "+--------------------+             +--------------------+\n" +
            "| Person Object      | <--ref--    | main():            |\n" +
            "| name = \"Bob\"       |             | p = [reference]    |\n" +
            "| age = 25           |             |                    |\n" +
            "+--------------------+             +--------------------+\n"
        );
        
        reassignPerson(p);
        
        System.out.println(
            "\n" +
            "Memory Layout After reassignPerson() returns:\n" +
            "+--------------------+             +--------------------+\n" +
            "| Heap Memory        |             | Stack Memory       |\n" +
            "+--------------------+             +--------------------+\n" +
            "| Person Object      | <--ref--    | main():            |\n" +
            "| name = \"Bob\"       |             | p = [reference]    |\n" +
            "| age = 25           | (unchanged) |                    |\n" +
            "+--------------------+             +--------------------+\n" +
            "\n" +
            "| Person Object      | (garbage    |\n" +
            "| name = \"Charlie\"   |  collected) |\n" +
            "| age = 35           |             |\n" +
            "+--------------------+             +--------------------+\n"
        );
        
        System.out.println("In main() after reassignPerson(): p = " + p);
    }
    
    /**
     * Changes the value of a primitive parameter
     */
    public static void changePrimitive(int y) {
        System.out.println("In changePrimitive(): before change, y = " + y);
        
        y = 20; // Modify the parameter
        
        System.out.println("In changePrimitive(): after change, y = " + y);
        
        System.out.println(
            "\n" +
            "Memory in changePrimitive() after change:\n" +
            "+--------------+\n" +
            "|              |\n" +
            "+--------------+\n" +
            "| y = 20       | (local change only)\n" +
            "+--------------+\n"
        );
    }
    
    /**
     * Modifies an object through a reference parameter
     */
    public static void modifyPersonObject(Person person) {
        System.out.println("In modifyPersonObject(): before change, person = " + person);
        
        System.out.println(
            "\n" +
            "Memory in modifyPersonObject():\n" +
            "+--------------------+             +--------------------+\n" +
            "| Heap Memory        |             | Stack Memory       |\n" +
            "+--------------------+             +--------------------+\n" +
            "| Person Object      | <--ref--    | modifyPersonObject():\n" +
            "| name = \"Alice\"     |             | person = [reference]\n" +
            "| age = 30           |             |                    |\n" +
            "+--------------------+             +--------------------+\n"
        );
        
        // Modify the object through the reference
        person.setAge(40);
        
        System.out.println("In modifyPersonObject(): after change, person = " + person);
    }
    
    /**
     * Reassigns a reference parameter
     */
    public static void reassignPerson(Person person) {
        System.out.println("In reassignPerson(): before reassignment, person = " + person);
        
        System.out.println(
            "\n" +
            "Memory in reassignPerson() before reassignment:\n" +
            "+--------------------+             +--------------------+\n" +
            "| Heap Memory        |             | Stack Memory       |\n" +
            "+--------------------+             +--------------------+\n" +
            "| Person Object      | <--ref--    | reassignPerson():  |\n" +
            "| name = \"Bob\"       |             | person = [reference]\n" +
            "| age = 25           |             |                    |\n" +
            "+--------------------+             +--------------------+\n"
        );
        
        // Create a new Person object and reassign the parameter
        person = new Person("Charlie", 35);
        
        System.out.println(
            "\n" +
            "Memory in reassignPerson() after reassignment:\n" +
            "+--------------------+             +--------------------+\n" +
            "| Heap Memory        |             | Stack Memory       |\n" +
            "+--------------------+             +--------------------+\n" +
            "| Person Object      |             | reassignPerson():  |\n" +
            "| name = \"Bob\"       |             | person = [new ref] |\n" +
            "| age = 25           |             |        |           |\n" +
            "+--------------------+             +----+---+-----------+\n" +
            "                                        |                \n" +
            "| Person Object      | <--new ref-------+                \n" +
            "| name = \"Charlie\"   |                                  \n" +
            "| age = 35           |                                  \n" +
            "+--------------------+                                  \n"
        );
        
        System.out.println("In reassignPerson(): after reassignment, person = " + person);
        // When this method returns, the new reference is lost
    }
}
