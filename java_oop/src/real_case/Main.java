package real_case;

import java.util.Scanner;
import java.util.UUID;

abstract class Display {

    abstract void notification();

    void showToken(UUID token) {
        System.out.println("Token generated : " + token);
    }
} 

class User extends Display {
    protected String username;
    protected String password;
    protected UUID token;

    void creationToken() {
        token = UUID.randomUUID();
    }
    
    void register(String username, String password) {
        this.username = username;
        this.password = password;
        creationToken();
        System.out.println("User : " + this.username);
        System.out.println("Password : " + this.password);
    }

    @Override
    void notification() {
        showToken(this.token);
        System.out.println("user created by user");
    }
}

class Admin extends User {
    final String role = "Admin";

    @Override
    void notification () {
        showToken(this.token);
        System.out.println("User Created by " + role);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("REGISTRASI");
        System.out.println("Username : ");
        String username = input.nextLine();

        System.out.println("Password : ");
        String password = input.nextLine();
        input.close();

        User user = new Admin();
        user.register(username, password);
        user.notification();
    }
}
