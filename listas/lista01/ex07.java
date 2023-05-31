package lista01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro e o segundo termo da PA");
        int termo1 = scan.nextInt();
        int termo2 = scan.nextInt();

        System.out.println("Digite o termo da PA que você deseja sber");
        int termoF = scan.nextInt();

        int resultado = (termo2 - termo1) * termoF;

        System.out.println("O valor do termo desejado é: " + resultado);
    }
}
