package modularizacao.lista06;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número e o programa dirá a soma dos primeiros números primos");
        int n1 = scan.nextInt();

        //aqui citamos o módulo da soma

        int soma = SomandoNumeros(n1);
        System.out.println("A soma dos primeiros números primos é: " + soma);
    }

    public static int SomandoNumeros(int n1){
        int numeroPrimos = 0, numeroAtual = 2, soma = 0;

        while (numeroAtual <= n1){
            boolean ehPrimo = true;

            for (int i = 2; i <= numeroAtual / 2; i++) {
                if (numeroAtual % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                soma = numeroAtual + soma;
            }
            numeroAtual++;
        }
        return soma;
    }
}
