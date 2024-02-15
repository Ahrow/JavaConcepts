package java_concepts.basic_oop_examples;

// public class defines a CLASS named BasicJavaProgram
public class BasicJavaProgram {

    // Main method is the entry point of any Java Application
    // Public: Method is accessible by any other class
    // Static: Method can be run without creating an instance of the class
    // Void: Method returns no value
    // String[] args: Method accepts single argument: array of strings which is command-line arguments passed to the program
    public static void main(String[] args) {

        // Basic data types declared as variables

        // int stores a number without decimals
        int myNumber = 10;
        // double stores a number with decimals
        double myDouble = 3.14;
        // String stores a string;
        String myString = "Hello";

        // Print a String to the console
        System.out.println("Hello World!");
        // Print a string stored in a variable
        System.out.println(myString);
        // print a double stored in a variable
        System.out.println(myDouble);

        // Basic Syntax Rules
        /*
        * Java is case-sensitive -> "Hello" and "hello" would be different identifiers
        * Class names should be UpperCamelCase
        * Method names should be lowerCamelCase
        * Statements must end with semicolon ex -> int myNumber = 10;
        * */

        // single line comment
        /*
            multiple line comment
        */

    }
}
