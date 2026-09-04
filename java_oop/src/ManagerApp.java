import lerch.mtthw.data.*;

public class ManagerApp {
    public static void main(String[] args) {
        var employee = new Employee("Marchel");
        employee.name = "dodi";
        employee.sayHello("Sindi");

        var manager = new Manager("Eko", "Astra Indonesia");
//        manager.name = "Marchel";
        manager.role = "Manager";
        manager.sayHello(employee.name);

        var vp = new VicePresident("Joko");
//        vp.name = "Joko";
//        vp.role = "Vice President";
        vp.sayHello(employee.name);

        System.out.println(manager);
        System.out.println(vp);

        var product = new Product("Iphone", 19);
    }
}
