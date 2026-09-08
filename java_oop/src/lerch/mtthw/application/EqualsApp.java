package lerch.mtthw.application;

public class EqualsApp {
    static void main(String[] args) {
        String first = "Marchel";
        first += " " + "Manullang";

        String second = "Marchel Manullang";

        System.out.println(first);
        System.out.println(second);
        System.out.println(first == second);
    }
}
