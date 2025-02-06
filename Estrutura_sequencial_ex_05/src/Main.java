import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
*/

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, quantidade1, peca2, quantidade2;
		double valor1, valor2, total;

		System.out.println("Digite o codigo da peça 1: ");
		peca1 = sc.nextInt();
		System.out.println("Digite a quantidade de peça 1: ");
		quantidade1 = sc.nextInt();
		System.out.println("Digite o valor da peça 1: ");
		valor1 = sc.nextDouble();
		System.out.println("Digite o codigo da peça 2: ");
		peca2 = sc.nextInt();
		System.out.println("Digite a quantidade de peça 2: ");
		quantidade2 = sc.nextInt();
		System.out.println("Digite o valor da peça 2: ");
		valor2 = sc.nextDouble();
		
		total = (quantidade1 * valor1) + (quantidade2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();

	}

}
