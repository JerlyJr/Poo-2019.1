import java.lang.reflect.Array;
import java.util.ArrayList;

public class Album {
    ArrayList<Figurinha> lista;

    public Album(ArrayList<Figurinha> lista) {
        this.lista = lista;
    }

    public ArrayList<Figurinha> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Figurinha> lista) {
        this.lista = lista;
    }
    public boolean inserirFigurinha(Figurinha figurinha){
        for(Figurinha fig : lista){
            if (fig.getId() == figurinha.getId()){
                System.out.println("fail: figurniah repetida");
                return false;
            }
            lista.add(figurinha);
            return true;
        }
    }
    public boolean removerFigurniha(int id){
        for (Figurinha fig : lista){
            lista.remove(fig);
            return true;
        }
        System.out.println("fail: figurniha não encontrada");
        return false;
    }
}
