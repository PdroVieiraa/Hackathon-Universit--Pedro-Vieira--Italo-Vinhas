public class Jurado extends Profissional{
    public String especialidade;

    public Jurado(String nome, String cpf, String areaAtuacao, String especialidade){
        super(nome, cpf, areaAtuacao);
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
