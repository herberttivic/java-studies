package veiculos;

public class Moto extends Veiculo{

    public Moto(){}

    public Moto(String placa, String modelo, String cor) {
        super(placa, modelo, cor);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
