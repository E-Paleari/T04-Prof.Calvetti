// Leia o ano de nascimento de uma pessoa e o ano atual. 
//Informe se ela já tem idade para votar (16 anos ou mais)
//e se possui idade para dirigir (18 anos ou mais).

import java.util.Scanner;

public class Voto_diri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o ano de nascimento: ");
        int nascimento = scanner.nextInt();
        System.out.print ("Digite o ano atual: ");
        int ano = scanner.nextInt();
        int idade = ano - nascimento;
        if (idade >= 18) {
                System.out.println("Pode votar e dirigir");
        } else if (idade >= 16) {
                System.out.println("Pode votar, porém não pode dirigir");
        } else {
                System.out.println("Não pode votar e nem dirigir");
        }
        scanner.close();
    }
}
