import java.util.ArrayList;

public class Topic {
    ArrayList<Passageiro> poltronas;
    int qtdPreferenciais;

    public Topic(int capacidade, int qtdPreferenciais){
        poltronas = new ArrayList<Passageiro>();
        for (int i  = 0; i < capacidade; i++){
            poltronas.add(null);
        }
        this.qtdPreferenciais = qtdPreferenciais;
    }

    @Override
    public String toString() {
        String saida = "[";
        for (int i = 0; i < poltronas.size(); i++){
            if (i < qtdPreferenciais){
                saida += " @";
            }
            else {
                saida += " =";
            }
            if(poltronas.get(i) != null){
                saida += poltronas.get(i);
            }
        }
        return saida + " ]";
    }
    public boolean inserir(int inicio, int fim, Passageiro pass){
        for (int i = inicio; i < fim; i++){
            if (poltronas.get(i) == null){
                poltronas.set(i,pass);
                return true;
            }

        }
        return false;
    }
}
