package lista05;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        int i = 1, mdc = 0;

        System.out.println("Digite dois numeros que o programa informara o mdc");
        a = scan.nextInt();
        b = scan.nextInt();

        while (i<=a || i<=b) {
            if (a%i == 0 && b%i == 0){
                mdc = i;
            }
            i = i + 1;

        }

        System.out.println("MDC: (" + a + ", " + b + ") = " + mdc);
    }
}
