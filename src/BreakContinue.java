package src;

public class BreakContinue {
    public static void main(String[] args) {
        // break
        int i = 0;
        while (true) {
            System.out.println("This will run forever unless we break out of the loop.");
            i++;
            
            if (i == 10) {
            break;
            }
        }

        // continue 
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }

    }    
}
