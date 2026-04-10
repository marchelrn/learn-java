package java_basic.Looping;

public class DoWhileLoops {
    public static void main(String[] args) {
        boolean condition = true;
        int i = 0;
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } while (condition);
        // Do while loops will execute the block of code at least once, even if the condition is false.
    }
}
