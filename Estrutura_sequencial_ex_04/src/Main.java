import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. 
*/

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalhada;
		double valorHora, salario;
		
		System.out.print("Digite o numero do funcionario: ");
		numeroFuncionario = sc.nextInt();
		System.out.print("Digite o numero de horas trabalhada: ");
		horasTrabalhada = sc.nextInt();
		System.out.print("Digite o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horasTrabalhada;
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.println("SALARIO = " + salario);

		sc.close();
	}

}
