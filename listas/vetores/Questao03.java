package vetores;

import java.util.Random;

public class Questao03 {
    public static void main(String[] args){

        int[] elementos = new int[50];

        preencherElementos(elementos);
        mostrarElementos(elementos);
    }
    public static void preencherElementos(int[] elementos){
        Random rand = new Random();
        for(int i = 0; i < elementos.length; i++){
            elementos[i] = rand.nextInt(100);
        }
    }
    public static void mostrarElementos(int[] elementos){
        for(int i = 0; i < elementos.length; i++){
            System.out.print(elementos[i] + " ");
        }
    }
    public static void mostrarOrdem(int[] elementos){

    }
}
