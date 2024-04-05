package set.comparable;
// ORDENAR SET COM TREESET
public class Product implements Comparable<Product>{

    private String id;
    private String name;
    private double price;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return id.toUpperCase().compareTo(o.getId().toUpperCase());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

}
