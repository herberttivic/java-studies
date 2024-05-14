import veiculos.IVeiculoFactory;
import veiculos.Veiculo;
import veiculos.aeronave.AeronaveFactory;
import veiculos.aeronave.Aviao;
import veiculos.terrestre.Carro;
import veiculos.terrestre.VeiculoTerrestreFactory;

public class Main {
    public static void main(String[] args) {

        IVeiculoFactory fabricaDeCarros = getVeiculoFactory("Terrestre");
        assert fabricaDeCarros != null;
        Carro golf = (Carro) fabricaDeCarros.createVeiculo("Carro");
        golf.setModelo("VW GOLF GT");
        golf.setCor("Vermelho");
        golf.setIdentificacao("FJN5N12");
        golf.setAno(2014);

        AeronaveFactory fabricaDeAeronaves = (AeronaveFactory) getVeiculoFactory("Aeronave");
        assert fabricaDeAeronaves != null;
        Aviao fedex=  (Aviao) fabricaDeAeronaves.createVeiculo("Aviao");
        fedex.setModelo("Boeing 767");
        fedex.setCor("Branco");
        fedex.setIdentificacao("SOSSOU");
        fedex.setAno(2020);

        System.out.println(golf.toString());
        System.out.println(fedex.toString());
    }

    public static IVeiculoFactory getVeiculoFactory(String tipo) {
        return switch (tipo){
            case "Terrestre" -> new VeiculoTerrestreFactory();
            case "Aeronave" -> new AeronaveFactory();
            default -> null;
        };
    }
}