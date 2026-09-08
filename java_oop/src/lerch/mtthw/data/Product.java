package lerch.mtthw.data;

import java.util.Objects;

public class Product {
    public String name;
    public Integer price;

    public Product(String name, Integer price) { // use public to use this constructors in different package
        this.name = name;
        this.price = price;

        System.out.println("The product name is " + this.name + " and the price is " + this.price);
    }

    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

//    public boolean equals(Object o) {
//        if (o == this) return true;
//        if (!(o instanceof Product product)) return false;
//
//        if (this.price != product.price) return false;
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }
}
