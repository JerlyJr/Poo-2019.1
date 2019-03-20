public class Carro {
    float gasolina;
    int maxGasolina;
    int passageiros;
    int maxPassageiros;
    int quilometragem;
    public Carro(){
        this.gasolina = 0;
        this.maxGasolina = 10;
        this.passageiros = 0;
        this.maxPassageiros = 2;
        this.quilometragem = 0;
    }

    @Override
    public String toString() {
        return "pass: " + this.passageiros + ", " + "gas: " + this.gasolina + ", " + "km: " + this.quilometragem;
    }
    public void entrar(){
        if (this.passageiros < maxPassageiros){
            this.passageiros += 1;
        }else{
        System.out.println("Carro Cheio");
        }

    }
    public void sair(){
        if (this.passageiros == 0){
            this.passageiros -= 1;
        }else{
        System.out.println("carro vazio");
        }
    }
    public void abastecer(float quantidade){
        gasolina += quantidade;
        if (this.gasolina > maxGasolina ){
            this.gasolina = maxGasolina;
        }
    }
    public void andar(float distancia){
        if (passageiros > 0){
            if (this.gasolina >= (distancia/10)){
                this.gasolina -= (distancia/10);
                this.quilometragem += distancia;
            }else{
                System.out.println("Gasolina Insuficiente");
            }
        }else{
            System.out.println("Passageiros Insuficientes");
        }
    }


}
