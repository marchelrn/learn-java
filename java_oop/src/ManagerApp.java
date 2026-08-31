public class ManagerApp {
    public static void main(String[] args) {
        var user = new User();
        user.name = "dodi";

        var manager = new Manager("Eko", "Astra Indonesia");
//        manager.name = "Marchel";
        manager.role = "Manager";
        manager.sayHello(user.name);

        var vp = new VicePresident("Joko");
//        vp.name = "Joko";
//        vp.role = "Vice President";
        vp.sayHello(user.name);
    }
}
