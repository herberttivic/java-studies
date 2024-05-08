public class BancoDeDadosPostgresAdapter implements BancoDeDados{

    BancoDeDadosPostgres postgres;
    BancoDeDadosPostgresAdapter(BancoDeDadosPostgres postgres){
        this.postgres = postgres;
    };

    @Override
    public void delete() {
        this.postgres.delete();
    }

    @Override
    public void insert() {
        this.postgres.insert();
    }

    @Override
    public void update() {
        this.postgres.update();
    }
}
