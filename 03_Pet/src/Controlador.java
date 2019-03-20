import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicho bicho = new Bicho(" ", 0, 0, 0);
        System.out.println("init nome E__ S__ L__, show, play, eat, sleep, clear, end. ");

        while (true) {
            String line = scanner.nextLine();
            System.out.println(line);
            String[] ui = line.split(" ");
            if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("show")) {
                System.out.println(bicho);
            } else if (ui[0].equals("init")) {
                bicho = new Bicho(ui[1], Integer.parseInt(ui[2]), Integer.parseInt(ui[3]), Integer.parseInt(ui[4]));
            }else if (ui[0].equals("play")){
                bicho.brincar();
            }else if (ui[0].equals("eat")){
                bicho.comer();
            }else if (ui[0].equals("sleep")){
                bicho.dormir();
            }else if (ui[0].equals("clear")){
                bicho.banho();
            }
            else{
                System.out.println("Comando invalido");
            }

        }
    }
}
