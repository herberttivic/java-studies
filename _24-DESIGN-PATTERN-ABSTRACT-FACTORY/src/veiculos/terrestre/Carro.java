package veiculos.terrestre;

public class Carro extends VeiculoTerrestre {

    public Carro(){}
    public Carro(String modelo, int ano, String identificacao, String cor) {
        super(modelo, ano, identificacao, cor);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", cor='" + cor + '\'' +
                ", identificacao='" + identificacao + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
