


public class Projeto {

    private String titulo;
    private String descricao;
    private Equipe equipe = new Equipe();
    private Orientador orientador = new Orientador();
    private double NotaFinal;


    public Projeto(String titulo, String descricao) { // Orientador e Equipe devem ser adicionados posteriormente
        this.titulo = titulo;
        this.descricao = descricao;
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

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    public double getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.NotaFinal = notaFinal;
    }

}
