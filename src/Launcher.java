import java.nio.file.Paths;
import java.util.*;
import java.nio.file.*;
import java.nio.file.Files.*;
import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Launcher {
    static List<Command> commands = List.of(
            new Quit(),
            new Fibo(),
            new Freq()
    );

    public static void main(String[] args) {
        System.out.println("Veuillez entrer votre commande :");
        Scanner scan = new Scanner(System.in);

        scan = new Scanner(System.in);
        String comm = scan.nextLine();
        while (!comm.equals("quit")) {
            for (Command c : commands)
            {
                if (c.name().equals(comm) && !c.run(scan))
                    return;
            }
            System.out.println("Veuillez entrer votre commande :");
            comm = scan.nextLine();
        }


}}