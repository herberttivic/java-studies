package veiculos;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected String cor;

    public Veiculo(){}
    public Veiculo(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public abstract String toString();
}
