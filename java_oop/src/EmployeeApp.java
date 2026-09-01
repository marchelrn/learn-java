import jdk.dynalink.linker.LinkerServices;

public class EmployeeApp {

    // Polymorphism
    public  static void main() {
        Employee employee = new Employee("Marchel");
        employee.sayHello("Doni");

        employee = new Manager("Satria");
        employee.sayHello("Doni");

        employee = new VicePresident("Soni");
        employee.sayHello("Doni");

        sayHello(new Employee("Marchel"));
    }

    static void sayHello( Employee employee ) {
        if (employee instanceof VicePresident vicePresident) {
            System.out.println("Hello VP " + vicePresident.name);
        } else if ( employee instanceof  Manager manager) {
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
