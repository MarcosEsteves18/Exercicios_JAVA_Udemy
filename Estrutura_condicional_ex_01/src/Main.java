import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("NAO NEGATIVO");
		}
		else{
			System.out.println("NEGATIVO");
		}
	}

}
