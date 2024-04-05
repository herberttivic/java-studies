package igualdades;

public class LiteralEqual {

    public static void main(String[] args){

//      O "==" GERA TRUE PARA VARIAVEIS QUE GUARDAM UM MESMO ¨VALOR¨
        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(s1 == s2);

//      O "==" GERA FALSE PARA VARIAVEIS QUE GUARDAM UM ¨OBJETO¨ IGUAL, POIS OS DOIS SÃO INSTANCIAS EM DIFERENTES LUGARES DA MEMÓRIA
        String o1 = new String("Teste");
        String o2 = new String("Teste");

        System.out.println(o1 == o2);
    }

}
