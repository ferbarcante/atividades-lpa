package lista05;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numeroPrimos = 0, numeroAtual = 2;

        System.out.println("Digite um numero");
        int numero = scan.nextInt();

        while (numeroAtual <= numero){
            boolean ehPrimo = true;

            for (int i = 2; i <= numeroAtual / 2; i++) {
                if (numeroAtual % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                System.out.println(numeroAtual + " ");
            }
             numeroAtual++;
        }
    }
}