package lista04;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int f = 0, a = 1, b = 1;
        int termo;

        System.out.println("Digite um número e irei informar se é um termo da sequencia de fibonacci");
        termo = scan.nextInt();

        while (f<termo){
            f = a + b;
            a = b;
            b = f;
        }
        if (f == termo || termo == 1){
            System.out.println("O termo faz parte da sequencia de fibonacci");
        } else {
            System.out.println("O termo não faz parte");
        }
    }
}
