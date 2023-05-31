package lista05;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        int r = 0;

        System.out.println("Digite um numero");
        n = scan.nextInt();

        for ( int i = 1; i<=n; i++){
            r = n/i;
            System.out.println(i + " / " + n + " = " + r);
        }
    }
}
