public class Main {
    public static void main(String[] args) {
        BancoDeDados bd1 = new BancoDeDadosAntigo();
        Repositorio repo1 = new Repositorio(bd1);
        System.out.println("============banco de dados antigo==========");
        repo1.bd.insert();
        repo1.bd.update();
        repo1.bd.delete();

        System.out.println();

        BancoDeDadosPostgres postgres = new BancoDeDadosPostgres();
        BancoDeDados bd2 = new BancoDeDadosPostgresAdapter(postgres);
        Repositorio repo2 = new Repositorio(bd2);
        System.out.println("====banco de dados postgres com adapter====");
        repo2.bd.insert();
        repo2.bd.update();
        repo2.bd.delete();
    }
}