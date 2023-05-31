package lista05;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        int r = 0;

        System.out.println("Digite o valor de A e B");
        a = scan.nextInt();
        b = scan.nextInt();

        int i = a;

        do {

            if (i%2==0){
                r = a * i;
                a = r;
                System.out.println(i);

            }
            i++;
        } while (i<=b);

        System.out.println(r);
    }
}
