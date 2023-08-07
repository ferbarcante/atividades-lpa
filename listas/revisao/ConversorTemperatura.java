package revisao;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celsius: ");
		double c = scan.nextDouble();
		
		double f = ((9*c)+160)/5;
		System.out.println("A temperatura " + c + " em fahrenheit é: " + f);
	}

}
