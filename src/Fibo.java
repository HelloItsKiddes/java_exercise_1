import java.util.Scanner;

public class Fibo implements Command{
    @Override
    public String name() {
        return "fibo";
    }

    @Override
    public boolean run(Scanner sc) {
        System.out.println("Veuillez entrer votre nombre: ");
        String n = sc.nextLine();
        try{
            int nb=Integer.parseInt(n);
            int u = 1, v = 1;
            for(int j = 2; j < nb; j++) {
                int temp = u+v;
                u = v;
                v = temp;}
                System.out.println(v);
                return true;
        }
        catch (NumberFormatException e){
            System.out.println("Il fallait rentrer un nombre");
            return false;
        }

        }

    }

