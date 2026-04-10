package Method;

public class MethodReccursive {
    public static void main(String[] args) {
        System.out.println(FactorialLoop(10));
        System.out.println(10 * 9* 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1);
        System.out.println(FatctorialReccursive(10));
        Loop(5000);
    }

    static int FactorialLoop(int value) {
        int result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    } 

    static int FatctorialReccursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * FatctorialReccursive( value - 1);
        }
    }

    static void Loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop, " + value);
            Loop(value - 1);
        }
    }
}