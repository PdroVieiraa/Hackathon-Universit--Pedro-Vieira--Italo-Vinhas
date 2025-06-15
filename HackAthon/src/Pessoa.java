public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Instituicao instituicao;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Instituicao getInstituicao() {
        return instituicao;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }

}
