// Receba um número inteiro e exiba se ele é Positivo ou Negativo (considere zero como positivo).

import java.util.Scanner;

public class Posi_nega {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o número que deseja verificar: ");
        int numero = scanner.nextInt();
        if (numero >= 0)
        {       System.out.println ("O número " + numero + " é positivo");
        }
        else 
        {       System.out.println ("O número " + numero + " é negativo");
        }
        scanner.close();
    }
}
