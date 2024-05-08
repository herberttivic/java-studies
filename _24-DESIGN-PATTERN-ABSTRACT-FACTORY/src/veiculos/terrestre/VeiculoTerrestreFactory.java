package veiculos.terrestre;

import veiculos.IVeiculoFactory;
import veiculos.Veiculo;

public class VeiculoTerrestreFactory implements IVeiculoFactory {

    @Override
    public Veiculo createVeiculo(String tipo) {
        return switch (tipo){
            case "Carro" -> new Carro();
            default -> null;
        };
    }
}
