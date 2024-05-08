package veiculos.terrestre;

import veiculos.Veiculo;

public abstract class VeiculoTerrestre extends Veiculo {
    public VeiculoTerrestre(){}
    public VeiculoTerrestre(String modelo, int ano, String identificacao, String cor) {
        super(modelo, ano, identificacao, cor);
    }

    @Override
    public abstract String toString();
}
