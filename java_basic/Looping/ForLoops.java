package java_basic.Looping;

public class ForLoops {
    public static void main(String[] args) {
        // for (int i = 1; i <= 2; i++) {
        //     for (int j = 1; j <= 3; j++) {
        //         System.out.println(i + " " + j);
            
        //     }
        // }

        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println(num);
        }

        for (int i = 10 ; i >= 0; --i) {
            System.out.println(i);
        }
    }
}
