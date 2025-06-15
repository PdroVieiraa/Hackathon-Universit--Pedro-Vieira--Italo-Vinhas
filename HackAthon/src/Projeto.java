public class Projeto {

    private String titulo;
    private String descricao;
    private Equipe equipe;
    private Profissional orientador;
    private double NotaFinal;


    public Projeto(String titulo, String descricao, Profissional orientador, Equipe equipe) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.orientador = orientador;
        this.equipe = equipe;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public void setOrientador(Profissional orientador) {
        this.orientador = orientador;
    }

    public double getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.NotaFinal = notaFinal;
    }

}
