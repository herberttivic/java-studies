package veiculos.aeronave;

public class Helicoptero extends Aeronave{
    public Helicoptero(){}
    public Helicoptero(String modelo, int ano, String identificacao, String cor) {
        super(modelo, ano, identificacao, cor);
    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "ano=" + ano +
                ", cor='" + cor + '\'' +
                ", identificacao='" + identificacao + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
