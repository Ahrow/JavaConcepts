package Concepts.ControlFlowStatements;

public class IfElseStatement {
    public static void main(String[] args) {
        // variable
        int number = 10;

        // if variable named number's value is greater than zero -> execute code block
        if (number > 0){
            // this will always trigger, because we store the value 10 in the variable number!
            System.out.println("The number is positive");
        }
        // else if number's value is less than zero -> execute code block
        else if (number < 0) {
            System.out.println("The number is negative");
        }
        // else, meaning every other option then above, meaning the number is neither positive or negative -> Execute codebock
        else {
            System.out.println("The number is zero");
        }

    }
}
