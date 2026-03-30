//Receba duas notas, calcule a média aritmética entre as notas
// e imprima o resultado: "Aprovado" (média >= 6.0); ou "Exame" (média < 6.0).

import java.util.Scanner;

public class Apro_exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print ("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 6.0)
        {       System.out.println ("Aprovado");
        }
        else
        {       System.out.println ("Exame");
        }
        scanner.close();
    }
}



