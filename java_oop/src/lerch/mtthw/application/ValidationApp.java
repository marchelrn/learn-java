package lerch.mtthw.application;

import lerch.mtthw.data.LoginRequest;
import lerch.mtthw.error.ValidationException;
import lerch.mtthw.util.ValidationUtil;

public class ValidationApp {
    static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Marchel", "rahasia");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("ERROR : " + e.getMessage());
        } finally {
            System.out.println("Gw di panggil mulu!");
        }
    }
}
