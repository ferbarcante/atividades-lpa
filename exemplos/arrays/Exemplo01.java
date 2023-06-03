package arrays;

public class Exemplo01 {
    public static void main(String[] args){

       /* int[] numeros = new int[5];
        //Os arrays tem tamanho imutável
        //[0] [1] [2] [3] [4]
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        System.out.println(numeros[1]);
        //Para acessar os numeros dentro do array iremos usar uma estrutura de repetição
        for(int i = 0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
        */
        //outra forma de declarar
        int[] numeros = {1, 2, 3, 4, 5};
        for(int i = 0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
