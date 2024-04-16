package consumer;

import product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Mouse AttackShark x3", 120));
        products.add(new Product("Teclado AttackShark k86", 220));
        products.add(new Product("Headset Fuxi h3", 270));

        products.sort((p1,p2)-> p1.getId() - p2.getId());
//        01 - usando classe que implementa consumer
//        products.forEach(new PriceUpdate());

//        02 - usando consumer declarado
//        Consumer<Product> consumer = (product) -> {
//            product.setPrice(product.getPrice() * 1.1);
//        };

//        03 - usando método estática na classe produto
//        products.forEach(product -> Product.staticProductUpdatePrice(product));

//        04 - usando método não-estático na classe produto
//        products.forEach(Product::nonStaticProductUpdatePrice);

//        05 - usando consumer direto na classe main
//        products.forEach(product -> product.setPrice(product.getPrice() *1.1));

        products.forEach(item -> {
            System.out.println(item.toString());
        });
    }
}
