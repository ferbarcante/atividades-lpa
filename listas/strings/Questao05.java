package strings;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scan.next();

        StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();
        System.out.println(palavraInvertida);
    }
}
