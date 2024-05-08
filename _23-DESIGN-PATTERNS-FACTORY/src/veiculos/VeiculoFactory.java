package veiculos;

public class VeiculoFactory {

    public Veiculo criaVeiculo(String tipo){
        if(tipo.equals("carro")){
            return new Car();
        }
        else {
            return new Moto();
        }
    }
}
