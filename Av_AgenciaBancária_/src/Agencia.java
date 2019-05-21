import java.util.ArrayList;

public class Agencia {
    ArrayList<Cliente> clientes;

    public Agencia(){
        this.clientes = new ArrayList<Cliente>();
    }
    public void addCliente(Cliente client){
        clientes.add(client);
    }
}
