package igualdades;

public class EqualAndHashCode {
    public static void main(String[] args) {
        String a = "Ana";
        String b = "Bruno";
        String c = "Ana";

//      USING EQUALS
//      MAIS SEGURO
//      MENOS RÁPIDO
        System.out.println(a.equals(c));


//      USING HASHCODE
//      MENOS SEGURO -> pode ocorrer de dois objetos diferentes retornarem o mesmo código
//      MAIS RÁPIDO
        int aHash = a.hashCode();
        int bHash = b.hashCode();
        int cHash = c.hashCode();

        System.out.println(aHash);
        System.out.println(bHash);
        System.out.println(cHash);
    }
}
