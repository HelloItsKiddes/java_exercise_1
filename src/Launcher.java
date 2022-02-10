import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner sc = new Scanner(System.in);
        String var;
        do {
            var=sc.nextLine();
            System.out.println("Unknown command");
        }
        while(!var.equals("quit"));

    }
}