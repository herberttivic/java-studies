package functions.functionsParams;

import product.Product;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Mouse AttackShark x3", 120));
        products.add(new Product("Teclado AttackShark k86", 220));
        products.add(new Product("Teclado Mackenike k500 tri-mode", 180));
        products.add(new Product("Headset Fuxi h3", 270));

        ProductService ps = new ProductService();

        Double sum = ps.filteredSum(products, product -> product.getName().charAt(0) == 'T');

        System.out.println("A soma é = R$"+ sum);
    }
}
