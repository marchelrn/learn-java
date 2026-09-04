package lerch.mtthw.data;

public class Product {
    String name;
    Integer price;

    public Product(String name, Integer price) { // use public to use this constructors in different package
        this.name = name;
        this.price = price;

        System.out.println("The product name is " + this.name + " and the price is " + this.price);
    }

}
