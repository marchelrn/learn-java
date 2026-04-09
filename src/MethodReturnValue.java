package src;

public class MethodReturnValue {
    public static void main(String[] args) {
     System.out.println(HelloWorld());
     System.out.println(sum(10, 20));
     System.out.println(firstChar("Lerch"));
    }

    static String HelloWorld() {
        return "Hello World";
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static char firstChar(String str) {
        return str.charAt(0);
    }
}
