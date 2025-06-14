public class Sala {
    public int numero;
    public int capacidade;

    public Sala(int numero, int capacidade){
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sala " + numero + " (Capacidade: " + capacidade + ")";
    }

}
