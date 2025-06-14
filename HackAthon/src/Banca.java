import java.util.Map;
import java.util.HashMap;
public class Banca implements Avaliavel {

    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados = new HashMap<>();

    public Banca(String titulo, String descricao) {
        this.projetoAvaliado = new Projeto(titulo, descricao);
    }

   public void adicionarJurado(Jurado jurado, int nota){
        jurados.put(jurado, nota);
   } 

   public double calcularNotaFinal(){
        if(jurados.isEmpty()){
            projetoAvaliado.setNotaFinal(0);
            return 0;
        }

        int soma = 0;
        for(Integer nota : jurados.values()){
            soma += nota;
        }
        return (double) soma / jurados.size();
   }

}
