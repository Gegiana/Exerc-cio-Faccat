package exercicio;

import java.util.Scanner;

public class Exercicio32Faccat {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o nome do 1� time: ");
        String time1 = sc.nextLine();
        
        System.out.print("Digite o nome do 2� time: ");
        String time2 = sc.nextLine();

        try {
        	
        System.out.print("Digite o n�mero de gols do 1� time: ");
        int golsTime1 = sc.nextInt();

        System.out.print("Digite o n�mero de gols do 2� time: ");
        int golsTime2 = sc.nextInt();

        if (golsTime1>golsTime2) {
        	System.out.println("O jogo encerrou "+golsTime1+" x "+golsTime2+", vencedor � "+time1);
        } else if (golsTime1==golsTime2) {
        	System.out.println("O jogo encerrou "+golsTime1+" x "+golsTime2+" deu EMPATE.");
        } else 
        	System.out.println("O jogo encerrou "+golsTime1+" x "+golsTime2+", vencedor � "+time2);
			
		} catch (Exception e) {
			System.out.println("Erro. Digite somente n�meros!!!"+e);
		}
        sc.close();
	}


	}

