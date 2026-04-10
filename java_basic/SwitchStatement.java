package java_basic;

public class SwitchStatement {
    public static void main(String[] args) {
        String value = "a";
        switch (value) {
            case "A":
                System.out.println("Nilai A");
                break;
            case "B":
            case "C":
                System.out.println("C");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
                break;
        }

        // Switch Lambda
        switch (value) {
            case "A" -> System.out.println("Nilai A");
            case "B", "C" -> System.out.println("C");
            default -> System.out.println("Mungkin anda salah jurusan");
        }

        // Switch Yield
        String result = switch (value) {
            case "A":
            yield "Nilai A";
            case "B", "C":
            yield "C";
            default:
            yield "Mungkin anda salah jurusan";
        };
        System.out.println(result);
    }    
}
