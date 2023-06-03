package vetores;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] idade = new int[20];
        String[] nome = new String[20];

        preencherIdade(idade, scan);
        preencherNome(nome, scan);
        int amedia = calcularMedia(idade);
        mostrarAcimaMedia(nome, idade, calcularMedia(idade));

        System.out.println("A media é: " + amedia);
    }
    public static void preencherIdade(int[] idade, Scanner scan){
        for(int i = 0; i< idade.length; i++){
            System.out.println("Digite a idade da pessoa");
            int idadePessoa = scan.nextInt();

            idade[i] = idadePessoa;
        }
    }

    public static void preencherNome(String[] nome, Scanner scan){
        for(int i = 0; i< nome.length; i++){
            System.out.println("Digite o nome da pessoa");
            String nomes = scan.next();

            nome[i] = nomes;
        }
    }

    public static int calcularMedia(int[] idade) {
        int soma = 0;

        for(int i = 0; i < idade.length; i++){
            soma += idade[i];
        }
        return soma/idade.length;
    }

    public static void mostrarAcimaMedia(String[] nome, int[] idade, int media){

        for(int i = 0; i < idade.length; i++){
            if(idade[i] > media){
                System.out.println(nome[i]);
            }
        }
    }
}
