package exercicio;

import java.util.Scanner;

public class Exercicio18Faccat {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System .in);
		
		  
		
		System.out.println("digite o ano atual:");
		int anoAtual= ler.nextInt();
		
		System.out.println("digite seu ano de nascimento:");
		int anoNascimento=ler.nextInt();
		int idade =anoAtual-anoNascimento;
		{
			
			if (idade >= 16)
			{
			System.out.println("Voc� esta apta(o) � votar!");
			}else
		
			 System.out.println("Voc� n�o est� apta(o) � votar!");
			{
			ler.close();
			}	
			
		}
	}
	
	}


