package java_basic;

public class NumberConversion {
    // converting data_type

        /*  
            widening casting conversion (automatic)
        
            byte -> short -> int -> long -> float -> double
        
        */

        byte NewByte = 100;
        short NewShort = NewByte;
        int NewInt = NewShort;
        long NewLong = NewInt;
        float NewFloat = NewLong;
        double NewDouble = NewFloat;

        /*  
            narrowing casting conversion (manual)
        
            double -> float -> long -> int -> short -> byte
        
        */

        int NewInt2 = 1000;
        byte NewByte2 = (byte) NewInt2; // !!! manual casting
}
