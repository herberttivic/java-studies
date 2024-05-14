import veiculos.Veiculo;
import veiculos.VeiculoFactory;

public class Main {
    public static void main(String[] args) {
        VeiculoFactory veiculoFactory = new VeiculoFactory();

        Veiculo veiculo = veiculoFactory.criaVeiculo("moto");
        veiculo.setCor("vermelha");
        veiculo.setModelo("CB 500");
        veiculo.setPlaca("DDE1G34");

        System.out.println(veiculo.toString());
    }
}