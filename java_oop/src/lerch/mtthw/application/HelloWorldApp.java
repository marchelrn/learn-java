package lerch.mtthw.application;

import lerch.mtthw.data.HelloWorld;

public class HelloWorldApp {
    static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };
        english.sayHello();
        english.sayHello("Marchel");


        indonesia.sayHello();
        indonesia.sayHello("Marchel");
    }
}
