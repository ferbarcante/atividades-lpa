package Strings;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma String");
        String numeros = scan.next();

        int qtdUm = contarUm(numeros);
        System.out.println(qtdUm);
    }

        public static int contarUm(String numeros){
            int count = 0;
            for (int i = 0; i < numeros.length(); i++) {
                if (numeros.charAt(i) == '1') {
                    count++;
                }
            }
            return count;
        }
}

