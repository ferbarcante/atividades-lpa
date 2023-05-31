package Strings;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nome = scan.next();

        char primeiraLetra = nome.charAt(0);

        if(primeiraLetra == 'a' || primeiraLetra == 'A'){
            System.out.println(nome);
        }
    }
}
