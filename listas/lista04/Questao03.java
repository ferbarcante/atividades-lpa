package lista04;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int terror= 0, comedia= 0, acao = 0;
        int idade;

        do {
            System.out.println("Digite sua idade");
            idade = scan.nextInt();

            System.out.println("Digite o seu filme preferido, 1 = terror, 2 = comedia, 3 = ação");
            int filme = scan.nextInt();
            if(filme==1){
                terror++;
            } else if (filme == 2){
                comedia++;
            } else if (filme == 3){
                acao++;
            }

        } while(idade>0);
    }
}
