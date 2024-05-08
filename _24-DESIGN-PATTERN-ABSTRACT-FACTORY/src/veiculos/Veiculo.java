package veiculos;

public abstract class Veiculo {
    protected String modelo;
    protected int ano;
    protected String identificacao;
    protected String cor;

    public Veiculo(){}
    public Veiculo(String modelo, int ano, String identificacao, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.identificacao = identificacao;
        this.cor = cor;
    }

    public void iniciarViagem(){
        System.out.println("Iniciando viagem");
    }

    public void finalizarViagem(){
        System.out.println("Finalizando viagem");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract String toString();
}
