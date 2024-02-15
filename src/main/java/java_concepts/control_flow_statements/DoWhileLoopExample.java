package java_concepts.control_flow_statements;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        // do-while loop
        do {
            System.out.println(count);
            count++;
        } while (count <= 5);
    }
}
