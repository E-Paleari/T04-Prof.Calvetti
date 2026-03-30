//Receba um número e informe se ele é múltiplo de 5 e múltiplo de 3 ao mesmo tempo.

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o número que deseja verificar: ");
        int numero = scanner.nextInt();
        if ((numero % 5 == 0) && (numero % 3 == 0))
        {       System.out.println ("O número " + numero + " é múltiplo por 5 e 3 ao mesmo tempo");
        }
        else 
        {       System.out.print ("O número " + numero + " não é múltiplo por 5 e 3 ao mesmo tempo");
        }
        scanner.close();
    }
}




