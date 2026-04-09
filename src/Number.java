package src;

public class Number {
    public static void main(String[] args) {
        byte IniByte = 127;
        short IniShort = 32767;
        int IniInt = 2147483647;
        long IniLong = 1000000000;
        long IniLong2 = 9223372036854775807L;

        // floating point number

        float IniFloat = 3.14f;
        double IniDouble = 3.14;

        // decimal, hexadecimal, binary
        int DecimalInt = 26;
        int HexaDecimalInt = 0x00000;
        int BinaryInt = 0b11010;

        // underscore in numeric literals
        int OneBillion = 1_000_000_000;

        System.out.println("Byte: " + IniByte);
        System.out.println("Short: " + IniShort);
        System.out.println("Int: " + IniInt);
        System.out.println("Long: " + IniLong);
        System.out.println("Long2: " + IniLong2);
        System.out.println("Float: " + IniFloat);
        System.out.println("Double: " + IniDouble);
        System.out.println("Decimal Int: " + DecimalInt);
        System.out.println("Hexadecimal Int: " + HexaDecimalInt);
        System.out.println("Binary Int: " + BinaryInt);
        System.out.println("One Billion: " + OneBillion);
    }
}
