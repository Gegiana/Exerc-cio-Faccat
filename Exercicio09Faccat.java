package exercicio;

import java.util.Scanner;

public class Exercicio09Faccat {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
	    System.out.print("Digite o seu sal�rio mensal ataual:R$");
	    float salario= sc.nextFloat();
	    System.out.print("Digite a porcentagem do reajuste do sal�rio");
	    float porcentagem= sc.nextFloat();
	    float salarioReal= salario*porcentagem/100;
	    float salarioFinal= salarioReal+salario;
	    System.out.print("O valor do novo sal�rio �:"+salarioFinal);


	}

}
