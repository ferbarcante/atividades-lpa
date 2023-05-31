package lista04;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;
        double s = 0, d = 1, cont = 0;

        System.out.println("Digite o valor de n");
        n = scan.nextInt();

        for (int i = 0; cont<=n; i++){
            s = i+1;
            d = s/(i+1);
        }

        System.out.println("O resultado da soma é: " + d);


    }
}
