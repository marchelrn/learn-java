package src.Operations;

public class TernaryOps {
    public static void main(String[] args) {
        var nilai = 75;

        // Normal if-else
        if (nilai >= 75) { 
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Silakan coba lagi tahun depan");
        }

        // Ternary Operator
        String result = nilai >= 75 ? "Selamat anda lulus" : "Silakan coba lagi tahun depan";
        System.out.println(result);
    }
    
}
