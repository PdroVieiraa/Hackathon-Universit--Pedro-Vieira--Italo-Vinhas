public class Orientador extends Profissional {
    private String especialidade;

    public Orientador(String nome, String cpf, Instituicao instituicao, String areaAtuacao, String especialidade) {
        super(nome, cpf, instituicao, areaAtuacao);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade;
    }
}