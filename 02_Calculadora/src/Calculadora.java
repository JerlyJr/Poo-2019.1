import java.util.Scanner;
public class Calculadora {
    private int bateria;
    private int maxBateria;

    public Calculadora(int bateria){
        this.bateria = bateria;
        this.maxBateria = bateria;
    }
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getMaxBateria() {
        return maxBateria;
    }

    public void setMaxBateria(int maxBateria) {
        this.maxBateria = maxBateria;
    }

    @Override
    public String toString() {
        return "Bateria: " + bateria + "/" + maxBateria;
    }
    public void charge(int valor){
        this.bateria += valor;
        if (this.bateria > this.maxBateria){
            this.bateria = this.maxBateria;
        }
    }
    public boolean gastarBateria(){
            if (this.bateria > 0){
        this.bateria -= 1;
        return true;
        }else{
            System.out.println("Não há carga o suficiente para realizar a operação");
            return false;
        }

    }
    public String somar(int a, int b) {
        if (gastarBateria()) {
            return "" + (a + b);
        }return "";
    }
    public String subtrair(int a, int b){
        if (gastarBateria()) {
            return "" + (a - b);
        }return "";
    }
    public String div(int a, int b){
        if(gastarBateria()) {
            return "" + (a / b);
        }
        if(b == 0){
            System.out.println("fail: divisao por zero");
            return "";
        }
        return "";
    }
    public String mult(int a, int b){
        if (gastarBateria()){
            return "" + (a * b);
        }return "";
    }

}
class Controller{
    Calculadora calc;
    static Scanner scan = new Scanner(System.in);

    public Controller() {
        calc = new Calculadora(0);
    }

    public void shell(String line){
        String ui[] = line.split(" ");
        if(ui[0].equals("help"))
            System.out.println("soma _a _b; show; div _a _b; charge _value");
        else if(ui[0].equals("init"))
            this.calc = new Calculadora(Integer.parseInt(ui[1]));
        else if(ui[0].equals("show"))
            System.out.println(calc);
        else if(ui[0].equals("charge")){
            calc.charge(Integer.parseInt(ui[1]));
        }else if(ui[0].equals("soma")){
            String value = calc.somar(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            if(!value.equals(""))
                System.out.println(value);}
        else if(ui[0].equals("sub")){
            String value = calc.subtrair(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            if(!value.equals(""))
                System.out.println(value);}
        else if(ui[0].equals("mult")){
            String value = calc.mult(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            if(!value.equals(""))
                System.out.println(value);
        }else if(ui[0].equals("div")){
            String value = calc.div(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            if(!value.equals(""))
                System.out.println(value);
        }else
            System.out.println("fail: comando invalido");
    }

    public static void main(String[] args) {
        Controller cont = new Controller();
        while(true){
            String line = scan.nextLine();
            System.out.println("$" + line);
            if(line.equals("end"))
                break;
            cont.shell(line);
        }
    }
}
