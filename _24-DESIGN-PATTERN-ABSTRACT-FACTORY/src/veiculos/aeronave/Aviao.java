package veiculos.aeronave;

public class Aviao extends Aeronave{
    public Aviao(){}
    public Aviao(String modelo, int ano, String identificacao, String cor) {
        super(modelo, ano, identificacao, cor);
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "ano=" + ano +
                ", cor='" + cor + '\'' +
                ", identificacao='" + identificacao + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

