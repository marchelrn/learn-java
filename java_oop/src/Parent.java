class Parent {
    String name;
    void doIt() {
        System.out.println("do it in parent");
    }
}

class Child extends Parent {
    void doIt() {
        System.out.println("do it in child");
        System.out.println(" my name is " + this.name);
    }
}
