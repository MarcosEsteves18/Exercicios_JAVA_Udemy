import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
 
Se o ponto estiver na origem, escreva a mensagem “Origem”. 
 
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação. */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double v1,v2;

		System.out.println("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		
		if(v1 == 0 && v2 == 0) {
			System.out.println("Origem");
		}
		else if(v1 >= 0 && v2 >= 0) {
			System.out.println("Q1");
		}
		else if(v1 <= 0 && v2 >= 0) {
			System.out.println("Q2");
		}
		else if(v1 <= 0 && v2 <= 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		
		sc.close();
	}

}
