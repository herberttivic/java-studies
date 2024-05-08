package veiculos.aeronave;

import veiculos.IVeiculoFactory;
import veiculos.Veiculo;

public class AeronaveFactory implements IVeiculoFactory {
    @Override
    public Veiculo createVeiculo(String tipo) {
        return switch (tipo) {
            case "Aviao" -> new Aviao();
            case "Helicoptero" -> new Helicoptero();
            default -> null;
        };
    }
}
