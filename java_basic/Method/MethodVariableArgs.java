package java_basic.Method;

public class MethodVariableArgs {
    public static void main(String[] args) {
        // int[] valueUserOne = {80,90,85};
        int[] valueUserTwo = {70,75,65};
        

        sayCongrats("Lerch", 80,90,85); // with value Arguments
        sayCongrats("John", valueUserTwo);
    }
    static void sayCongrats( String name, int... values /*  int[] values  this code isn't variable args*/) {
        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalScores = total / values.length;

        if (finalScores >= 80) {
            System.out.println("Congratulations " + name + ", you passed with a final score of " + finalScores);
        } else {
            System.out.println("Sorry " + name + ", you failed with a final score of " + finalScores);
        }
    }
    
}
