package pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2,3,6,7,8);

//        MAP
        Stream<Integer> stream1 = lista.stream().map(item -> item*10);
        System.out.println(Arrays.toString(stream1.toArray()));

//        REDUCE
        int sum = lista.stream().reduce(0, (x,y)-> x+y);
        System.out.println("Soma = "+ sum);

//        FILTER
        List<Integer> listaImpares = lista.stream().filter(item -> item % 2!= 0).toList();
        System.out.println(Arrays.toString(listaImpares.toArray()));
    }
}
