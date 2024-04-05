package TiposCoringas;

import shapes.Circle;
import shapes.Shape;
import shapes.Triangle;
import java.util.ArrayList;
import java.util.List;

public class TIposCoringasDelimitados {
//        -------- NUNCA É PERMITIDO ADICIONAR UM INTEM NUMA LISTA GENÉRICA
    public static void main(String[] args){
        Circle circle = new Circle(1);
        Circle circle2 = new Circle(1.2);
        Circle circle3 = new Circle(1.1);

        Triangle triangle = new Triangle(3,4);
//        -------- O CÓDIGO ABAIXO FUNCIONA NORMALMENTE PARA A FUNÇÃO PRINTAREAS(LIST<SHAPE> LIST)
//        ArrayList<Shape> myShapes = new ArrayList<Shape>();
//
//        myShapes.add(circle);
//        myShapes.add(triangle);
//

//        -------- O CÓDIGO ABAIXO NÃO FUNCIONA PARA A FUNÇÃO PRINTAREAS(LIST<SHAPE> LIST)
//        -------- PARA FUNCIONAR, É NECESSÁRIO DEFINIR PRINTAREAS(LIST<? EXTENDS SHAPE> LIST)

        ArrayList<Circle> myCircles = new ArrayList<Circle>();
        myCircles.add(circle);
        myCircles.add(circle2);
        myCircles.add(circle3);

        printAreas(myCircles);


    }
    public static void printAreas(List<? extends Shape> list){
        list.forEach(shape -> {
            System.out.println(shape.getArea());
        });
    }
}
