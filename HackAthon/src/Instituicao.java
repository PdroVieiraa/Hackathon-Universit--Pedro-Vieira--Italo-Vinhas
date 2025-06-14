public abstract class Instituicao{
    public String nome;
    public String cnpj;

    public Instituicao(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CNPJ: " + cnpj;
    }
}
