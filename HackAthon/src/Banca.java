import java.util.Map;
import java.util.HashMap;
public class Banca implements Avaliavel {

    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados = new HashMap<>();


    public Banca(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

   public void adicionarJurado(Jurado jurado, int nota){
        jurados.put(jurado, nota);
   } 

   public void calcularNotaFinal(){
        if(jurados.isEmpty()){
            projetoAvaliado.setNotaFinal(0);
            return;
        }
        int soma = 0;
        for(Integer nota : jurados.values()){
            soma += nota;
        }
        double media = (double) soma / jurados.size();
        projetoAvaliado.setNotaFinal(media);
    }
}
