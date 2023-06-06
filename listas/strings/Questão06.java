package strings;

import java.util.Scanner;

public class Questão06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma String");
        String palavra1 = scan.next();

        char posicaoUm = palavra1.charAt(0);
        char posicaoDois = palavra1.charAt(1);

        System.out.println(palavra1.replace(posicaoUm, posicaoDois));
    }
}
