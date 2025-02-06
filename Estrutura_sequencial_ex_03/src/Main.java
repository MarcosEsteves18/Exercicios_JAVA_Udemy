import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 
*/

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, diferenca;
		
		System.out.print("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		B = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		C = sc.nextInt();
		System.out.print("Digite o quarta numero: ");
		D = sc.nextInt();
		
		diferenca = (A * B) - (C * D);
		System.out.println("DIFERENCA = " + diferenca);

		sc.close();
	}

}
