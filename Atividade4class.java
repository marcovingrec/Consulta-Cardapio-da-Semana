package Aula3;

import java.util.Scanner;

public class Atividade4class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		do {
		
		System.out.println("==================   CARDAPIO DE REFEICAO DA SEMANA   ==================");
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("1 - DOMINGO    2 - SEGUNDA-FEIRA    3 - TERCA-FEIRA    4 - QUARTA-FEIRA");
		System.out.println("          5 - QUINTA-FEIRA    6 - SEXTA-FEIRA    7 - SABADO");
		System.out.println("                                 8 - SAIR");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Digite a opcao para saber o cardapio do dia: ");
		numero = input.nextInt();
		switch(numero) {
		case 1:
			System.out.println("Hoje e DOMINGO!");
			System.out.println("Cardapio do dia: LAZANHA BOLOGNHESA");
			System.out.println("-----------------------------------------------------------------------");
			break;
		case 2:
			System.out.println("Hoje e SEGUNDA-FEIRA!");
			System.out.println("Cardapio do dia: Bife acebolado");
			System.out.println("-----------------------------------------------------------------------");
			break;	
		case 3:
			System.out.println("Hoje e TERCA-FEIRA!");
			System.out.println("Cardapio do dia: Pirao de Chambaril");
			System.out.println("-----------------------------------------------------------------------");
			break;
		case 4:
			System.out.println("Hoje e QUARTA-FEIRA!");
			System.out.println("Cardapio do dia: Bode Guisado");
			System.out.println("-----------------------------------------------------------------------");
			break;
		case 5:
			System.out.println("Hoje e QUINTA-FEIRA!");
			System.out.println("Cardapio do dia: Galinha Cabidela");
			System.out.println("-----------------------------------------------------------------------");
			break;
		case 6:
			System.out.println("Hoje e SEXTA-FEIRA!");
			System.out.println("Cardapio do dia: Feijoada");
			System.out.println("-----------------------------------------------------------------------");
			break;	
		case 7:
			System.out.println("Hoje e SABADO!");
			System.out.println("Cardapio do dia: Sinfonia Maritima");
			System.out.println("-----------------------------------------------------------------------");
			break;	
			
		}
		
		
		
		
		
	}while (numero !=8);

}
}
