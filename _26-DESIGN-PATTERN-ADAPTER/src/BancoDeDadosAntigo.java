public class BancoDeDadosAntigo implements BancoDeDados{

    @Override
    public void insert() {
        System.out.println("INSERT on Table");
    }

    @Override
    public void delete() {
        System.out.println("DELETE on Table");
    }

    @Override
    public void update() {
        System.out.println("UPDATE on Table");
    }
}
