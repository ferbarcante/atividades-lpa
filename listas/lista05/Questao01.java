package lista05;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int posicao,  i;
        int a = 1, b = 1, s = 1;

        System.out.println("Digite a posição que deseja");
        posicao = scan.nextInt();

        for (i = 0; i<posicao; i++){
            System.out.print(s + ", ");

            s = a + b;
            a = b;
            b = s;
        }
    }
}
