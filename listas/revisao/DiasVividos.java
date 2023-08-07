package revisao;

import java.util.Scanner;

public class DiasVividos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em anos, meses e dias: ");
		int anos = scan.nextInt();
		int meses = scan.nextInt();
		int dias = scan.nextInt();
		
		int operacao = (anos * 360) + (meses * 30) + dias;
		
		System.out.println(operacao);
	}

}
