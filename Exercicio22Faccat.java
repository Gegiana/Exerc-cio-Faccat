package exercicio;

import java.util.Scanner;

public class Exercicio22Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de horas trabalhadas em um m�s:");
		int quantidadeHorasTrabalhadas = sc.nextInt();

		System.out.println("digite o valor recebido por cada hora trabalhada:");
		float valorHora = sc.nextFloat();

		if (quantidadeHorasTrabalhadas < 161) {
			float salarioFinal = quantidadeHorasTrabalhadas * valorHora;
			System.out.println("O valor serrecebido � :R$ " + salarioFinal);

		} else {
			float salarioFinal = (160 * valorHora + valorHora + valorHora * 50 / 100);
			System.out.println("O valor  a ser recebido � R$" + salarioFinal);

		}
		  
		   
		 
	}
	
	
	
	
	
	
	
	
	
	
	

	}
