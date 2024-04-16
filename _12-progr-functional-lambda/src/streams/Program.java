package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3,4,6,7,8);
        Stream<Integer> numerosStream= numeros.stream().map(item -> item*10);
        System.out.println(Arrays.toString(numeros.toArray()));
        System.out.println(Arrays.toString(numerosStream.toArray()));


        Stream<String> nomes = Stream.of("Herbert", "Celma", "José");
        System.out.println(Arrays.toString(nomes.toArray()));


        Stream<Integer> numeros2 = Stream.iterate(0, x -> x+2);
        System.out.println(Arrays.toString(numeros2.limit(10).toArray()));


        Stream<Long> fibonacci = Stream
                .iterate(new Long[]{0L,1L}, longs -> new Long[] { longs[1], longs[0]+longs[1]})
                .map(list -> list[0]);
        System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
    }
}
