import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Topic topic = new Topic(0,0);
        Scanner scanner = new Scanner(System.in);

        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("end")){
                break;
            }
            else if (ui[0].equals("init")){
                topic = new Topic(Integer.parseInt(ui[1]),
                        Integer.parseInt(ui[2]));
            }
            else if (ui[0].equals("show")){
                System.out.println(topic);
            }
        }
    }
}
