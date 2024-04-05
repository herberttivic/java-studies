package shapes;

public class Triangle extends Shape{
    public Triangle (double h, double w){
        super(h, w);
    }

    public double getArea(){
        return (this.h * this.w)/2;
    }

}
