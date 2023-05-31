package lista01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade em anos, meses e dias:");
        int anos = scan.nextInt();
        int meses = scan.nextInt();
        int dias = scan.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A sua idade em dias é: " + totalDias);
    }
}
