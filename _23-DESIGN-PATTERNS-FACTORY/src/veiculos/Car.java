package veiculos;

public class Car extends Veiculo {

    public Car(){}

    public Car(String placa, String modelo, String cor) {
        super(placa, modelo, cor);
    }

    @Override
    public String toString() {
        return "Car{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
