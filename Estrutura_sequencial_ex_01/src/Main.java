import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. 
*/

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		int x = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int y = sc.nextInt();
		
		int soma = x + y;
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
