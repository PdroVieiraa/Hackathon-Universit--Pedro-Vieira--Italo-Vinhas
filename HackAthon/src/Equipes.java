import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instancia;
    private List<Equipe> lista;

    private Equipes() {
        lista = new ArrayList<>();
    }

    public static Equipes getInstancia() {
        if (instancia == null) {
            instancia = new Equipes();
        }
        return instancia;
    }

    public void adicionar(Equipe equipe) {
        lista.add(equipe);
    }

    public List<Equipe> getLista() {
        return lista;
    }
}
