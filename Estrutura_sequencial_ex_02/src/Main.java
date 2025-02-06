import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos. 
 
Fórmula da área: area = π . raio2 
 
Considere o valor de π = 3.14159 
*/

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi, area, raio;
		pi = 3.14159;
		
		System.out.print("Digite o raio: ");
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2) * pi;
		System.out.printf("Area = %.4f ", area);
		
		sc.close();
	}

}
