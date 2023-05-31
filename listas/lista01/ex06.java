package lista01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as 3 notas do aluno");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();

        System.out.println("Digite os seus respectivos pesos");
        double p1 = scan.nextDouble();
        double p2 = scan.nextDouble();
        double p3 = scan.nextDouble();

        double nota = ((n1 * p1) + (n2 * p2) + (n3 * p3)) /(p1 + p2 + p3);

        System.out.println("A sua media foi: " + nota);
    }
}
