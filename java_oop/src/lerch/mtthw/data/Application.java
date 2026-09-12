package lerch.mtthw.data;

import jdk.swing.interop.SwingInterOpUtils;

public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Apllication");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
