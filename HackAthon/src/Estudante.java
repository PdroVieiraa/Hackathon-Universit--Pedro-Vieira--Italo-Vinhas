public class Estudante extends Pessoa{
    public String curso;
    public int periodo;

    public Estudante(String nome, String cpf, String curso, int periodo){
        super(nome,cpf);
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso + ", Periodo: " + periodo;
    }


}
