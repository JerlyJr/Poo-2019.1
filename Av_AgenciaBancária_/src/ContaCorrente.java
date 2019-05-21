public class ContaCorrente extends Cliente {
    double saldo;
    public ContaCorrente(String id, String nome) {
        super(id, nome);
        this.saldo = 0;
    }
    public double tarifa(){
        this.saldo -= 20;
        return this.saldo;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() + "CC:" + saldo;
    }
}
