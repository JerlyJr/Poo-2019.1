public class Cliente {
    String id;
    String nome;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    @Override
    public String toString() {
        return id + ":" + nome + ":";
    }
}
