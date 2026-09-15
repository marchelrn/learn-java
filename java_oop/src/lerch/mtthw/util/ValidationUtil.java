package lerch.mtthw.util;

import lerch.mtthw.data.LoginRequest;
import lerch.mtthw.error.BlankException;
import lerch.mtthw.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh kosong");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password tidak boleh kosong");
        }
    }
}
