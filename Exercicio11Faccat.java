package exercicio;

import java.util.Scanner;

public class Exercicio11Faccat {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o valor do seu sal�rio fixo por m�s:R$");
		float salarioFixo= sc.nextFloat();
		
		System.out.println("Digite o valor da sua comiss�o que recebe por cada carro vendido: R$");
		float comissaoFixa= sc.nextFloat();
		
		System.out.println("Digite a quantidade de carros vendidos no m�s:");
		float quantidadeCarros= sc.nextFloat();
		
		System.out.println("Digite o valor total vendido no m�s");
		float valorTotal= sc.nextFloat();
		
		float totalComissao= quantidadeCarros*comissaoFixa;
		float porcentagemValor=valorTotal*5/100;
		
		float valorFinal= salarioFixo+totalComissao+porcentagemValor;
		
		System.out.println("O valor final do sal�rio corresponde a:R$");
		
		sc.close();
		
	
		
	   
	    
		
	    
		
		
		


		

		
	}

}
