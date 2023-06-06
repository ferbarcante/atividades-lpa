package strings;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scan.next();

        for(int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    }
}
