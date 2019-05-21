public class ContaPoupança extends Cliente {
    double saldo;
    public ContaPoupança(String id, String nome) {
        super(id, nome);
        this.saldo = 0;
    }
    public double rendimento(){
        this.saldo = this.saldo * 1.01;
        return saldo;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() + "CP:" + saldo;
    }
}
