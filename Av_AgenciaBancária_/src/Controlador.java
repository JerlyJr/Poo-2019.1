import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Agencia ag = new Agencia();
        Scanner scanner = new Scanner(System.in);


        while (true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if (ui[0].equals("end")){
                break;
            }else if (ui[0].equals("show")){
                System.out.println(ag);
            }else if (ui[0].equals("addC")){
                ag.addCliente(new ContaCorrente(ui[1],ui[2]));
                ag.addCliente(new ContaPoupança(ui[1],ui[2]));
            }
        }

    }
}
