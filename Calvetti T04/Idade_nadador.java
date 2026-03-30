// Receba a idade de um nadador e imprima "Categoria Adulta" se ele tiver 18 anos ou mais.

import java.util.Scanner;

public class Idade_nadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        if ( idade >= 18)
        {       System.out.println ("Categoria Adulta");
        }
        else
        {       System.out.println ("Categoria infantil");
        }
        scanner.close();
    }
}