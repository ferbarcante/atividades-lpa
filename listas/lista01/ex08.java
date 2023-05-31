package lista01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int valor = scan.nextInt();

        int nota50 = valor/50;
        int nota10 = (valor%50) / 10;
        int nota5 = ((valor%50) % 10) / 5;
        int nota1 = ((valor%50) % 10) % 5;

        System.out.println("Notas de R$50,00: " + nota50);
        System.out.println("Notas de R$10,00: " + nota10);
        System.out.println("Notas de R$5,00: " + nota5);
        System.out.println("Notas de R$1,00: " + nota1);
    }
}