import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar. 



*/

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int inicial, finalizou,duracao;
		
		System.out.println("Digite a hora que iniciou: ");
		inicial = sc.nextInt();
		System.out.println("Digite a hora que finalizou: ");
		finalizou = sc.nextInt();
		
		if(inicial > finalizou) {
			duracao = (24 - inicial) + finalizou;
		}
		else if(inicial == finalizou){
			duracao = 24;
		}
		else {
			duracao = (finalizou - inicial);
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");
		sc.close();

	}

}
