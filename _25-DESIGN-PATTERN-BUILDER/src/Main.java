public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa.Builder()
                .withNome("Minha tarefa")
                .withDescricao("Tarefa privada")
                .withStatus("pendente")
                .withResponsaveId("qwg2ds-3v3vsd-51c25r-144fcf")
                .withDuracao(1)
                .withDataDeInicio("11/11/2015")
                .withDataDeConclusao("12/11/2015")
                .build();

        System.out.println(tarefa.toString());
    }
}