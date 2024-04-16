package functions.functionsParams;

import product.Product;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum (List<Product> products, Predicate<Product> predicate){
        double sum = 0;

        for(Product product : products){
            if(predicate.test(product)){
                sum += product.getPrice();
            }
        }

        return sum;
    }
}
