package Concepts.Polymorphism.Example;

public class PolymorphismExample {
    /**
     * Static method to display the shape information.
     * This method is static because it can be called without needing an instance of PolymorphismExample.
     * It demonstrates polymorphism by accepting any object that is a subclass of Shape.
     * @param shape The Shape object whose information is to be displayed.
     */
    public static void displayShape(Shape shape) {
        shape.displayShapeInfo(); // Dynamically calls the overridden displayShapeInfo method based on the object's class.
    }

    public static void main(String[] args) {
        // Create an instance of Shape
        Shape myShape = new Shape();
        // Create an instance of Circle
        Shape myCircle = new Circle();
        // Create an instance of Rectangle
        Shape myRectangle = new Rectangle();

        // This will call the displayShapeInfo method defined in Shape.
        displayShape(myShape);
        // This will call the displayShapeInfo method overridden in Circle.
        displayShape(myCircle);
        // This will call the displayShapeInfo method overridden in Rectangle.
        displayShape(myRectangle);
    }
}
