class User {
    String name;
    String role;
}

class Manager extends User {
    String name;
    String company;

    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        String companyGreet = " And Im from " +  this.company;

        if (this.company != null) {
            System.out.println("Hello " + name + ", My name is " + this.role + " " + this.name + companyGreet);
        } else {
            System.out.println("Hello " + name + ", My name is " + this.role + " " + this.name);
        }
    }
}


class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }

    @Override
    void sayHello(String name) {
        System.out.println( "Hello " + name + ", My name is "+ "Vice President"+ " " + this.name );
    }
}
