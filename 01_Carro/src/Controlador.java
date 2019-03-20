import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro Carro = new Carro();

        while (true){
            String line = scanner.nextLine();
            System.out.println(line);
            String[] ui = line.split(" ");
            if (ui[0].equals("end")){
                break;
            }else if (ui[0].equals("in")){
                Carro.entrar();
            }else if (ui[0].equals("out")){
                Carro.sair();
            }else if (ui[0].equals("show")){
                System.out.println(Carro);;
            }else if (ui[0].equals("fuel")){
                Carro.abastecer(Float.parseFloat(ui[1]));
            }else if (ui[0].equals("drive")){
                Carro.andar(Integer.parseInt(ui[1]));
            }else{
                System.out.println("Comando Inválido");
            }
        }
    }
}
