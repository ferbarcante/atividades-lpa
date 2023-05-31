package modularizacao.lista06;

import java.util.Scanner;

public class Questao01 {

        public static int CalculandoMMC(int n1, int n2) {
            int i, j, mmc = 0;
            for (i = 1; i <= n1; i++) {
                for (j = 1; j <= n2; j++) {
                    if (i == j && n1 % i == 0 && n2 % j == 0) {
                        mmc = i;
                    }
                }
            }
            return (n1 * n2) / mmc;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int mmc = CalculandoMMC(n1, n2);
        System.out.println("O MMC de " + n1 + " e " + n2 + " é: " + mmc);

        System.out.println("Agora digite mais dois números");
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();

        mmc = CalculandoMMC(n3, n4);
        System.out.println("O MMC de " + n3 + " e " + n4 + " é: " + mmc);


    }
}
