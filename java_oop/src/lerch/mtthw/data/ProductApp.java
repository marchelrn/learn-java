package lerch.mtthw.data;

public class ProductApp {
    static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30000000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
