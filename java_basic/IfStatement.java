package java_basic;

public class IfStatement {
    public static void main(String[] args) {
        var lulus = 60 ;
        var absen = 80 ;

        if (lulus >= 60 && absen >= 13) {
            System.out.print("Selamat anda lulus");
            if (lulus >= 80) {
                System.out.println(" dengan nilai A"); 
            } else if (lulus >= 70) {
                System.out.println(" dengan nilai B");
            } else if (lulus >= 60) {
                System.out.println(" dengan nilai C");
            }
        } else {
            System.out.println("Maaf anda tidak lulus, Silakan coba lagi tahun depan");
        }
    }    
}
