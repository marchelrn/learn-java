package src;

public class SwitchStatement {
    public static void main(String[] args) {
        String value = "d";
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
    }
    
}
