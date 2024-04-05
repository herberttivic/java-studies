package TiposCoringas;
import java.util.Arrays;
import java.util.List;

public class TiposCoringas {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(10,2,3,4,6);

        printList(nums);

    }
//    Object ¨É¨ supertipo de Integer
//    List<Object> ¨NÃO É¨ supertipo de List<Integer>

//    <?> é o tipo genérico para listas. Caso usasse <Object> não seria possível usar como tipo genérico (ANY)
    public static void printList(List<?> list){
//        ----------NÃO É POSSÍVEL EXECUTAR A PRÓXIMA LINHA DE COMANDO POIS list É UMA LISTA GENÉRICA
//        list.add(4);
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
