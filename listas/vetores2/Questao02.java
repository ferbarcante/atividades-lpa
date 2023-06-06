package vetores2;

import java.util.Random;

public class Questao02 {
    public static void main(String[] args) {

        int[] vetor = new int[50];

        preencherVetor(vetor);
        int maiorPosicao = informarPosicaoMaior(vetor);

        System.out.println("a posição com maior valor é: " + maiorPosicao);

    }
    public static void preencherVetor(int[] vetor){
        Random rand = new Random();
        for(int i = 0; i<vetor.length; i++){
            vetor[i] = rand.nextInt(100);
        }
    }
    public static int informarPosicaoMaior(int[] vetor){
        int cont = 0;
        for(int i = 0; i<vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    cont = i;
                }  else if (vetor[i] == vetor[j]) {

                   continue;
                }
            }
        }

        return cont;
    }
}