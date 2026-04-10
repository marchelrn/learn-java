package java_basic;

public class DataTypeNotPrimitive {
    public static void main(String[] args) {
        Long longObject = 123456789L;
        Double doubleObject = 3.14;
        // Boolean booleanObject = true;

        Byte byteObject = null;

        System.out.println(byteObject);

        int iniInt = 10;
        Integer integerObject = iniInt; // convert primitive int to Integer object (autoboxing)
        System.out.println(longObject);
        System.out.println(doubleObject);
        System.out.println(integerObject);
        System.out.println(integerObject.getClass());

        byte byteValue = integerObject.byteValue();
        short shortValue = integerObject.shortValue();
        System.out.println(byteValue);
        System.out.println(shortValue);
    }
}
