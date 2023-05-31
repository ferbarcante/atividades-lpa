package modularizacao;

import java.util.Random;
public class Exemplo01 {
    public static void main(String[] args){
        sum( 10, 15);
    }

    //é dizer que essa tal soma irá fazer oq está no bloco sempre que for chamada!
    //o parentese é o que queremos passar de instrução para esse método, o tipo
     static void sum(int x, int y){
        System.out.println(x + y);

    }
}
