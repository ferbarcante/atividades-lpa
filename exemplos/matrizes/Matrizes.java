package matrizes;

public class Matrizes {
    public static void main(String[] args){
        //o que é uma matriz? é uma tabela de n x m elementos

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 4;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 6;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 5;
        notasAlunos[1][3] = 8;

        notasAlunos[2][0] = 5;
        notasAlunos[2][1] = 6;
        notasAlunos[2][2] = 8;
        notasAlunos[2][3] = 3;


        //imprimindo na tela
        for(int i = 0; i<notasAlunos.length; i++){
            for(int j = 0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }

        //calculando média
        double soma;
        System.out.println("Calculando a média de cada aluno");
        for(int i = 0; i<notasAlunos.length; i++){

            soma = 0;

            for(int j = 0; j<notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + " é = " + (soma/4));
        }

    }
}
