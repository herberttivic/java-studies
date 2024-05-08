package veiculos.aeronave;

import veiculos.Veiculo;

public abstract class Aeronave extends Veiculo {
    public Aeronave(){}
    public Aeronave(String modelo, int ano, String identificacao, String cor) {
        super(modelo,ano,identificacao,cor);
    }

    @Override
    public abstract String toString();
}
