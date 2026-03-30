// Receba três valores (A, B, C) e verifique se eles podem formar um triângulo
// (A soma de dois lados deve ser sempre maior que o terceiro).

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print ("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.print ("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();
        if (((valor1 + valor2) > valor3) && ((valor1 + valor3) > valor2) && ((valor2 + valor3) > valor1))
        {       System.out.println ("Forma um triângulo");
        }
        else
        {       System.out.println("Não forma um triângulo");
        }
        scanner.close();
    }
}



