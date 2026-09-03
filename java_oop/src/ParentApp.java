public class ParentApp {
    static void main() {

        Parent parent = new Parent();
        parent.name = "Papa";
        parent.doIt();
        System.out.println(parent.name);

        Child child = new Child();
        parent.name = "doni";
        child.name = "Marchel";
        child.doIt();
        System.out.println(parent.name);
        System.out.println(child.name);
    }
}
