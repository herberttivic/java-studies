package set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Mouse");
        set.add("Teclado");
        set.add("Monitor");
        set.add("Fone");

        starts(set);
        methods();
    }

    public static void methods() {

        Set<Integer> l1 = new TreeSet<>(Arrays.asList(13,12,23,24,5,6,7,8));
        Set<Integer> l2 = new TreeSet<>(Arrays.asList(11,23,24,5,6,7,8, 9, 10));

//        union
        Set<Integer> a = new TreeSet<>(l1);
        a.addAll(l2);
        System.out.println(a);

//        intersection
        Set<Integer> b = new TreeSet<>(l1);
        b.retainAll(l2);
        System.out.println(b);

//        difference
        Set<Integer> c =  new TreeSet<>(l1);
        c.removeAll(l2);
        System.out.println(c);
    }

    public static void starts(Set<String> set) {
//        remove
//        set.removeIf(item -> item == "Fone");

        System.out.println("______________");
        set.forEach(item -> {
            System.out.println(item);
        });
        System.out.println("______________");
    }
}
