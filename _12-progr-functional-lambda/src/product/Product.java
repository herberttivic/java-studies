package product;

public class Product implements Comparable<Product> {

 private static int lastId = 1;
 private final int id;
 private String name;
 private double price;

 public Product(String name, double price) {
  this.id = this.lastId;
  lastId++;
  this.name = name;
  this.price = price;
 }

 public int getId() {
  return id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getPrice() {
  return price;
 }

 public String getStringPrice(){
  return "R$"+ String.format("%.2f", getPrice());
 }

 public void setPrice(double price) {
  this.price = price;
 }

 public static  boolean staticProductPredicate(Product product){
  return product.getPrice() > 150;
 }

 public boolean nonStaticProductPredicate(){
  return this.getPrice() > 150;
 }

 public static void staticProductUpdatePrice(Product product){
   product.setPrice(product.getPrice() *1.1);
 }
 public void nonStaticProductUpdatePrice(){
  this.setPrice(this.price *1.1);
 }

 public static String staticUperCaseName(Product product ){
  return product.getName().toUpperCase();
 }
 public String nonStaticUperCaseName(){
  return this.getName().toUpperCase();
 }

 @Override
 public String toString() {
  return "[id="+this.id+"] [name="+this.name+"] [price="+this.getStringPrice()+"]";
 }

 @Override
 public int compareTo(Product product) {
  return this.name.toLowerCase().compareTo(product.getName().toLowerCase());
 }
}
