package lerch.mtthw.application;

import lerch.mtthw.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectToDatabase("", "Rahasia");
        System.out.println("Sukses");
    }

    public static void connectToDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect ke database!");
        } else if (username.isBlank() || password.isBlank()) {
            throw new DatabaseError("Tidak bisa connect ke database!");
        }
    }
}
