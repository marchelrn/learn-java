class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person (String paramName, String paramAdrress) {
        name = paramName;
        address = paramAdrress;
    }

    Person (String paramName){
        this(paramName, null);
    }

    Person (){
        this(null);
    }

    void sayHello(String ParamName) {
        System.out.println("Hello " + ParamName + ", My name is " + name);
    }
}