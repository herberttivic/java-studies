package SQL_LANG.ENTITIES;

public class Product {
    private static int lastId = 0;
    private int id;
    private String name;
    private double price;
    private int category_id;

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Product( String name, double price, int categoryId) {
        this.id = lastId;
        lastId++;
        this.name = name;
        this.price = price;
        category_id = categoryId;
    }
}
