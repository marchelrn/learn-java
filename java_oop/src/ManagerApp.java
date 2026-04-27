public class ManagerApp {
    public static void main(String[] args) {
        var user = new User();
        user.name = "dodi";

        var manager = new Manager();
        manager.name = "Marchel";
        manager.role = "Manager";
        manager.sayHello(user.name);

        var vp = new VicePresident();
        vp.name = "Joko";
        vp.role = "Vice President";
        vp.sayHello(user.name);
    }
}
