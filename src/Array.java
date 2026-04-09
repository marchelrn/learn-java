package src;

public class Array {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Andi";
        names[1] = "Budi";
        names[2] = "Cici";
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        int[] ages = new int[]{
            25, 30, 35
        };

        ages[0] = 12;
        System.out.println(ages.length);
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        ages[0] = 11;
        System.out.println(ages.length);
        System.out.println(ages[0]);

        String[][] members = {
            {"Andi", "Budi", "Cici"},
            {"Dedi", "Edi", "Fifi"}
        };
        System.out.println(members[0][2]);
        System.out.println(members[1][0]);
    }
}
