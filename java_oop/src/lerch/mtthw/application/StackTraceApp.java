package lerch.mtthw.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names= {
                "John",
                "Jane",
                "Doe"
            };
            System.out.println(names[100]);
        } catch (Throwable t) {
            t.printStackTrace();
        }

        try {
            sampleError();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names= {
                "John",
                "Jane",
                "Doe"
            };
            System.out.println(names[100]);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
