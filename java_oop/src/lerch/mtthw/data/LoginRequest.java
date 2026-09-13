package lerch.mtthw.data;

public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Memanggil object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    public void sayHello() {
        System.out.println("Hello " + this.username);
    }
}
