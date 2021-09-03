package tabuada;

import java.util.Scanner;

public class CriandoTabuada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int multiplicando, multiplicador, resto;
		int contador = 1;
		
		System.out.println("FAZEMOS SUA TABUADA PARA VOCÊ!!");
		System.out.println("********************************");
		System.out.println("Qual é o multiplicando desejado?");
		multiplicando = leitor.nextInt();
		
		System.out.println("Qual é o multiplicador máximo?");
		multiplicador = leitor.nextInt();
		
		leitor.close();
		
		System.out.println("---------------------------------------------------");
		
		while (contador <= multiplicador) {
			resto = multiplicando * contador;
			
			System.out.println(multiplicando + " x " + contador + " = " + resto);
			
			contador++;
		}
		
		System.out.println("---------------------------------------------------");
	}

}
