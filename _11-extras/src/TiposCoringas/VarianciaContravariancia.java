package TiposCoringas;

import java.util.ArrayList;

public class VarianciaContravariancia {
    public static void main(String[] args){
        ArrayList<Integer> intList =  new ArrayList<Integer>();
        ArrayList<Double> doubleList =  new ArrayList<Double>();
        ArrayList<Object> objectsList = new ArrayList<Object>();

        intList.add(2);
        intList.add(4);
        intList.add(7);

        doubleList.add(2.5);
        doubleList.add(6.5);
        doubleList.add(10.5);

        copy(intList, objectsList);
        copy(doubleList, objectsList);

        objectsList.forEach(item ->{
            System.out.println(item);
        });
    }
//
//  NA TIPAGEM DOS PARAMETROS EU DIGO QUE:
//  FROM É UM LISTA DE ALGUMA CLASSE FILHA DE NUMBER (no caso uma lista de int ou lista de double)
//  TO É UMA LISTA DE ALGUMA CLASSE PAI DE NUMBER (no caso uma lista de object)
    public static void copy(ArrayList<? extends Number> from, ArrayList<? super Number> to ){
        from.forEach(item -> {
           to.add(item);
       });
    }
}
