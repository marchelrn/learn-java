class User {
    String name;
    String role;
}

class Manager extends User {
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.role + " " + this.name );
    }
}


class VicePresident extends Manager {
    @Override
    void sayHello(String name) {
        System.out.println( "Hello " + name + ", My name is "+ this.role + " " + this.name );
    }
}
