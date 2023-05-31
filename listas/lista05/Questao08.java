package lista05;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        int r = 0;

        System.out.println("Digite um número");
        n = scan.nextInt();

        for (int i = 0; i <= 10; i++){
            r = i * n;
            System.out.println(i + " + " + n + " = " + r);
        }
    }
}
