package src.Looping;

public class ForEach {
    public static void main(String[] args) {
        // Without for-each loop
        String[] names = {"Alice", "Bob", "Charlie"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // With for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
