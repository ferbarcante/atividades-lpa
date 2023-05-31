package lista05;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro e o programa dirá se é primo ou não!");
        int numero = scan.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        /* se o número numero não for primo, um de seus fatores deve ser menor ou igual a numero / 2, e verificar até
         a metade já é suficiente para encontrar esse fator, se ele existir.*/

        if (ehPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
