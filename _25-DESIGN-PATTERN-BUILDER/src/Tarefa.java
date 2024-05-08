public class Tarefa {
    private String nome;
    private String descricao;
    private String status;
    private String dataDeInicio;
    private String dataDeConclusao;
    private int duracao;
    private String responsaveId;


    public static final class Builder {
        private String dataDeConclusao;
        private String nome;
        private String descricao;
        private String status;
        private String dataDeInicio;
        private int duracao;
        private String responsaveId;

        public Builder() {

        }

        public Builder withDataDeConclusao(String dataDeConclusao) {
            this.dataDeConclusao = dataDeConclusao;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder withStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder withDataDeInicio(String dataDeInicio) {
            this.dataDeInicio = dataDeInicio;
            return this;
        }

        public Builder withDuracao(int duracao) {
            this.duracao = duracao;
            return this;
        }

        public Builder withResponsaveId(String responsaveId) {
            this.responsaveId = responsaveId;
            return this;
        }

        public Tarefa build() {
            Tarefa tarefa = new Tarefa();
            tarefa.responsaveId = this.responsaveId;
            tarefa.duracao = this.duracao;
            tarefa.dataDeConclusao = this.dataDeConclusao;
            tarefa.descricao = this.descricao;
            tarefa.dataDeInicio = this.dataDeInicio;
            tarefa.nome = this.nome;
            tarefa.status = this.status;
            return tarefa;
        }
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "dataDeConclusao='" + dataDeConclusao + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", dataDeInicio='" + dataDeInicio + '\'' +
                ", duracao=" + duracao +
                ", responsaveId='" + responsaveId + '\'' +
                '}';
    }
}
