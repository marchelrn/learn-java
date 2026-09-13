package lerch.mtthw.application;

import lerch.mtthw.data.LoginRequest;

public class RecordApp {
    static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Marchel", "Rahasia");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println( new LoginRequest());
        System.out.println( new LoginRequest("Marchel"));
        loginRequest.sayHello();
    }
}
