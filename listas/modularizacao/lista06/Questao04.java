package modularizacao.lista06;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Voce quer ver a tabuada?");
        String resposta = scan.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Agora digite um valor inteiro entre 1 e 11");
            int n1 = scan.nextInt();

            Tabuada(n1);
        }

    }

    public static void Tabuada(int n1){

        for(int i = 0; i < 10; i++){
            int r = n1*i;
            System.out.println(n1 + " x " + i + " = " + r);
        }

    }
}
