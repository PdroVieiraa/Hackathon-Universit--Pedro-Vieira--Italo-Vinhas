import java.util.ArrayList;
import java.util.List;
public class Equipe{
    public String nomeEquipe;
    private List<Estudante> membros;

    public Equipe(String nomeEquipe){
        this.membros = new ArrayList<>();
        this.nomeEquipe = nomeEquipe;
   }
    
   public void adicionarEstudante(Estudante estudante){
        membros.add(estudante);
   }

   public void listarEstudantes(){
        for(Estudante estudante : membros){
            System.out.println(estudante);
        }
   }

   public String getNomeEquipe() {
       return nomeEquipe;
   }
   public List<Estudante> getMembros() {
       return membros;
   }
   public void setNomeEquipe(String nomeEquipe) {
       this.nomeEquipe = nomeEquipe;
   }
   public void setMembros(List<Estudante> membros) {
       this.membros = membros;
   }

   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Equipe: ").append(nomeEquipe).append("\nMembros:\n");
       for (Estudante e : membros) {
           sb.append(e.toString()).append("\n");
       }
       return sb.toString();
   }

}
