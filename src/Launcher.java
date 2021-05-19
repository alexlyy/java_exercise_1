import java.util.Scanner;
public class Launcher {
    public static void main(String[] args)
    {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Bienvenue");
        String inputUser = myscanner.nextLine();
        if (inputUser.equals("quit")) {
            System.exit(0);
         } else {
            System.out.println("Unknown command");
        }
    }
}
