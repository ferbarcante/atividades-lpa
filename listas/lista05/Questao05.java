package lista05;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 1, r = 0, i = 1;
        System.out.println("Digite um numero que o programa mostrará o fatorial");
        int fatorial = scan.nextInt();

        do {
            r = a * i;
            a = r;
            i++;
        } while (i<=fatorial);

        System.out.println("O fatorial é: " + r);
    }
}
