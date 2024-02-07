package Concepts.BasicObjectOrientedProgramming;


public class Car {
    // Fields (or Attributes)
    private String color; // The color of the car
    private int year;     // The manufacture year of the car

    // Constructor
    /*
     * The constructor is a special method that is called when an object is instantiated.
     * It is used to initialize the object's properties.
     * The 'this' keyword refers to the current instance of the class.
     */
    public Car(String color, int year) { // Constructor with two parameters: color and year
        this.color = color; // Sets the color attribute of the object
        this.year = year;   // Sets the year attribute of the object
    }

    // Getter methods
    /*
     * Getters are used to retrieve the value of an object's attributes.
     * This allows for read-only access to the attribute.
     */
    public String getColor() {
        return color; // Returns the color of the car
    }

    public int getYear() {
        return year; // Returns the manufacture year of the car
    }

    // Setter methods
    /*
     * Setters are used to set the value of an object's attributes.
     * This allows for write access to the attribute.
     */
    public void setColor(String color) {
        this.color = color; // Sets a new color for the car
    }

    public void setYear(int year) {
        this.year = year; // Sets a new manufacture year for the car
    }

    // displayInfo Method
    /*
     * This method prints the details of the car to the console.
     * It's an example of a class method that performs an action.
     * The "void" part means that it does not return a value.
     */
    public void displayInfo() {
        System.out.println("Car Color: " + color + ", Year: " + year);
    }

    // Main method
    public static void main(String[] args) {
        // Creating a new Car object with color "red" and year 1967
        Car car = new Car("red", 1967);
        System.out.println("Before changes:");
        car.displayInfo(); // Display car information using the displayInfo method

        // Changing car attributes using setter methods
        car.setColor("blue"); // Changing the color of the car to "blue"
        car.setYear(2020);    // Changing the manufacture year of the car to 2020

        System.out.println("After changes:");
        car.displayInfo(); // Display car information again to see the changes

        // Accessing car attributes using getter methods
        String carColor = car.getColor(); // Getting the current color of the car
        int carYear = car.getYear();      // Getting the current manufacture year of the car

        // Printing the accessed values
        System.out.println("Accessed via getters:");
        System.out.println("Car Color: " + carColor + ", Year: " + carYear);
    }
}

