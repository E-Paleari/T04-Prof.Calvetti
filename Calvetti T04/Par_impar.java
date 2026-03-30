import java.util.Scanner;

public class Par_impar {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o número: ");
        int numero = scanner.nextInt();
        if ( numero % 2 == 0)
        {       System.out.println("Par");
        }
        else 
        {       System.out.println("Impar");
        }
    scanner.close();
    }
}
