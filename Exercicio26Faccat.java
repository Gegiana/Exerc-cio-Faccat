package exercicio;

import java.util.Scanner;

public class Exercicio26Faccat {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a quntidade atual do estoque:");
		int qntdAtual = ler.nextInt();

		System.out.println("Digite a quantidade maxima em estoque:");
		int qntdMaxima = ler.nextInt();

		System.out.println("Digite a quntidade minima em estoque:");
		int qntdMinima = ler.nextInt();

		int qntdMedia = ((qntdMaxima + qntdMinima) / 2);
		System.out.println("Quantidade m�dia: " + qntdMedia);

		if (qntdAtual >= qntdMedia) {
			System.out.println("N�o efetuar compra!");

		} else {
			System.out.println("Efetuar compra!");
		}

			ler.close();

		}

	
}


