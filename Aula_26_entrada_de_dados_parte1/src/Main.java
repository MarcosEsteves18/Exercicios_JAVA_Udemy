import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome:");
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		System.out.println("Digite um numero inteiro:");
		int x1;
		x1 = sc.nextInt();
		System.out.println("Voce digitou: " + x1);
		
		System.out.println("Digite um numero com ponto flutuante:");
		double x2;
		x2 = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f%n", x2);
		
		System.out.println("Digite um caractere:");
		char x3;
		x3 = sc.next().charAt(0);
		System.out.println("Voce digitou: " + x3);
		
		sc.close();
	}

}
