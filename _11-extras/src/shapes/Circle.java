package shapes;

public class Circle extends Shape{
    public Circle (double r){
        super(2*r,2*r);
    }

    public double getArea(){
        return 3.14 * (this.w/2 * this.w/2);
    }
}
