package predicates;

import product.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Mouse AttackShark x3", 120));
        products.add(new Product("Teclado AttackShark k86", 220));
        products.add(new Product("Headset Havit Fuxi h3", 270));
        products.add(new Product("Mousepad Fortrek 90x40", 80));

        // 1 - predicado direto
        // products.removeIf(product -> product.getPrice() < 150);

        // 2 - criando uma classe que implementa uma interface funcional camada Predicate
        // products.removeIf(new ProductPredicate());

        // 3 - usando método estático na classe Product
        // products.removeIf(product -> Product.staticProductPredicate(product));

        // 4 - usando método não-estático na classe Product
        // products.removeIf(Product::nonStaticProductPredicate);

        // 5 - criando um predicado na função main
        Predicate<Product> predicate = (product) -> product.getPrice() > 150;
        products.removeIf(predicate);

        products.forEach(product -> {
            System.out.println(product.toString());
        });
    }
}
