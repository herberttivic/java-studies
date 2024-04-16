package functions;

import product.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Mouse AttackShark x3", 120));
        products.add(new Product("Teclado AttackShark k86", 220));
        products.add(new Product("Headset Fuxi h3", 270));

//        esse código converte a lista para stream -> gera uma nova lista de Strings e converte de volta a stream para lista
//        MAP é um método de STREAM, por isso deve ser converter a lista para string para pode usar esse recurso
//        01 - usando uma classe que implementa function para fazer a função
//        List<String> stringProducts = products.stream().map(new UperCaseName()).collect(Collectors.toList());

//        02 - usando uma classe estática implementada na classe produto
//        List<String> stringProducts = products.stream().map(Product::staticUperCaseName).collect(Collectors.toList());

//        03 - usando método não-estático implementado na classe produto
//        List<String> stringProducts = products.stream().map(Product::nonStaticUperCaseName).toList();

//        04 - criando expressão lambda no static main
//        Function<Product, String> function = (product) -> product.getName().toUpperCase();
//        List<String> stringProducts = products.stream().map(function).toList();

//        05 - usando função inline direto no map
        List<String> stringProducts = products.stream().map(product -> product.getName().toUpperCase()).toList();

        stringProducts.forEach(item -> {
            System.out.println(item);
        });
    }
}
