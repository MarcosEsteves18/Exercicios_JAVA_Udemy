import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente. */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		
		System.out.println("Digite o numero A: ");
		A = sc.nextInt();
		System.out.println("Digite o numero B: ");
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}

}
