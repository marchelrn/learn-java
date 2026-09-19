package lerch.mtthw.application;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    private static final String FILE_PATH = "README.md";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader( new FileReader(FILE_PATH))){
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable t) {
            System.out.println("Error membaca file : " + t.getMessage());
        } finally {
            System.out.println("Sukses menutup file " + FILE_PATH);
        }
    }
}
