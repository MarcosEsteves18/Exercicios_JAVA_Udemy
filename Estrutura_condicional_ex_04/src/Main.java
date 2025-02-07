import java.util.Scanner;

/* 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */

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
