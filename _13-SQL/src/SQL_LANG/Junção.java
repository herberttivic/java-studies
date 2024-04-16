package SQL_LANG;

import java.util.Arrays;
import java.util.List;

public class Junção {

    public static void main(String[] args) {
        String produtoCartesianoSemCriterio = "SELECT * FROM PRODUCT, CATEGORY";
//       ESSE COMANDO DEVOLVE TODOS OS ITEMS DE PRODUTOS SE REPETINDO PARA CADA ITEM DE CATEGORY FAZENDO UMA COMBINAÇÃO ENTRE TODOS OS ITENS DE CADA TABELA

        String juncaoComChaveEstrangeira_ChavePrimaria = "SELECT * FROM PRODUCT, CATEGORY WHERE PRODUCT.CATEGORY_ID = CATEGORY.ID";
        String juncaoComChaveEstrangeira_ChavePrimaria2 = "SELECT * FROM PRODUCT INNER JOIN CATERGORY category ON PRODUCT.CATEGORY_ID = category.ID";
//        DEVOLVE TODOS OS ITENS DE PRODUTOS COM SUAS RESPECTIVAS CATEGORIAS INSERIDAS ATRAVÉS DO ID

        String juncaoComRestricaoOuFiltro = juncaoComChaveEstrangeira_ChavePrimaria2 + " WHERE CATEGORY.NAME = 'Computadores'";
//        DEVOLVE TODOS OS ITENS DA TABELA DE PRODUTOS EM QUE A CATEGORIA.NAME SEJA IGUAL A "Computadores"

        String projecaoSelect = "SELECT PRODUCT.* , CATEGORY.NAME FROM PRODUCT INNER JOIN CATERGORY category ON PRODUCT.CATEGORY_ID = category.ID";
//        NESSE CÓDIGO É SELECIONAOD TUDO(*) DE PRODUCT E APENAS O NAME DE CATEGORY PARA QUE O RESULTADO NÃO REPITA O ID DA CATEGORIA COM O CATEGORY_ID(DE PRODUCT)

        List<String> comandos = Arrays.asList(
                produtoCartesianoSemCriterio,
                juncaoComChaveEstrangeira_ChavePrimaria,
                juncaoComChaveEstrangeira_ChavePrimaria2,
                juncaoComRestricaoOuFiltro,
                projecaoSelect
        );

        printStrings(comandos);
    }

    public static void printStrings(List<String> list){
        for(String item : list){
            System.out.println(item);
        }
    }

}
