public abstract class Profissional extends Pessoa{
    public String areaAtuacao;

    public Profissional(String nome, String cpf, String areaAtuacao){
        super(nome, cpf);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Area de Atuação: " + areaAtuacao;
    }

}
