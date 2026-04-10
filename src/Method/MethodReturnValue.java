package src.Method;

public class MethodReturnValue {
    public static void main(String[] args) {
     System.out.println(HelloWorld());
     System.out.println(sum(10, 20));
     System.out.println(firstChar("Lerch"));
     System.out.println(hitung(30, "%", 20));
    }

    static String HelloWorld() {
        return "Hello World";
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int hitung(int a, String operator, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
            default:
                throw new IllegalArgumentException("Operator tidak valid");
        }
    }

    static char firstChar(String str) {
        return str.charAt(0);
    }

}
