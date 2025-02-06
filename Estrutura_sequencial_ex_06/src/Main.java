import java.util.Locale;
import java.util.Scanner;

/* 
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B. 
*/


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
		double pi = 3.14159;

		System.out.print("Qual valor de A: ");
		A = sc.nextDouble();
		System.out.print("Qual valor de B: ");
		B = sc.nextDouble();
		System.out.print("Qual valor de C: ");
		C = sc.nextDouble();
		
		System.out.println();
		Triangulo = (A * C) / 2;
		Circulo = Math.pow(C, 2) * pi;
		Trapezio = ((A + B) * C) / 2;
		Quadrado = B * B;
		Retangulo = A * B;
		
		System.out.printf("TRIANGULO = %.3f %n", Triangulo);
		System.out.printf("CIRCULO = %.3f %n", Circulo);
		System.out.printf("TRAPEZIO = %.3f %n", Trapezio);
		System.out.printf("QUADRADO = %.3f %n", Quadrado);
		System.out.printf("RETANGULO = %.3f %n", Retangulo);
		
		sc.close();
	}

}
