import product.Product;
import product.ProductComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Mouse AttackShark x3", 120));
        products.add(new Product("Teclado AttackShark k86", 220));
        products.add(new Product("Headset Fuxi h3", 270));

        products.sort((p1,p2)-> p1.getId() - p2.getId());

        products.forEach(item -> {
            System.out.println(item.toString());
        });
    }
}