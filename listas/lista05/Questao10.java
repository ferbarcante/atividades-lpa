package lista05;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, r;
        int operador = 0;

        System.out.println("Digite dois numeros");
        a = scan.nextInt();
        b = scan.nextInt();

        while(operador!=6) {
            System.out.println("---------------------------");
            System.out.println("      1 - Soma");
            System.out.println("      2 - Subtração");
            System.out.println("      3 - Multiplicação");
            System.out.println("      4 - Divisão");
            System.out.println("      5 - Trocar valores");
            System.out.println("      6 - Sair");
            System.out.println("---------------------------");

            operador = scan.nextInt();
            if (operador==1){
                r = a + b;
                System.out.println("O resultado da soma é: " + r);
            } else if (operador==2){
                r = a - b;
                System.out.println("O resultado da subtração é: " + r);
            } else if (operador==3){
                r = a*b;
                System.out.println("O resultado da multiplicação é: " + r);
            } else if (operador==4){
                r = a/b;
                System.out.println("O resultado da divisão é: " + r);
            } else if (operador==5) {
                System.out.println("Digite dois numeros");
                a = scan.nextInt();
                b = scan.nextInt();
            }
        }



    }
}
