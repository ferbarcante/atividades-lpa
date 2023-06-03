package vetores;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] candidatos = new String[6];
        int[] votos = new int[10];

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Digite o nome do candidato");
            candidatos[i] = scan.next();
        }

        for (int j = 0; j < votos.length; j++) {
            System.out.println("----------------------------------");
            System.out.println("     (1) - " + candidatos[1]);
            System.out.println("     (2) - " + candidatos[2]);
            System.out.println("     (3) - " + candidatos[3]);
            System.out.println("     (4) - " + candidatos[4]);
            System.out.println("     (5) - " + candidatos[5]);
            System.out.println("     (0) - " + candidatos[0]);
            System.out.println("----------------------------------");

            votos[j] = scan.nextInt();
        }

        for(int i = 0; i < votos.length; i++){
            System.out.println(votos[i]);
        }
    }
}
