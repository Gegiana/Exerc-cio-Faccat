package exercicio;

import java.util.Scanner;

public class Exercicio30Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
		
		System.out.println("Insira o 1� valor");
		int n1 = sc.nextInt();
		System.out.println("Insira o 2� valor");
		int n2 = sc.nextInt();
		System.out.println("Insira o 3� valor");
		int n3 = sc.nextInt();
		
		if ((n1==n2)||(n2==n3)||(n3==n1)) {
			System.out.println("Valores iguais n�o s�o permitidos.");
		} else if ((n1<n2)&&(n2<n3)) { //se o 1� valor for menor que 2�; e o 2� valor for menor que 3;
			System.out.println("A ordem crescente ficou "+n1+" "+n2+" "+n3+".");
		} else if ((n1<n3)&&(n3<n2)) { //se o 1� valor for menor que 3�; e o 3� valor for menor que 2;
			System.out.println("A ordem crescente ficou "+n1+" "+n3+" "+n2+".");
		} else if ((n2<n1)&&(n1<n3)) { //se o 2� valor for menor que 1�; e o 1� valor for menor que 3;
			System.out.println("A ordem crescente ficou "+n2+" "+n1+" "+n3+".");
		} else if ((n2<n3)&&(n3<n1)) { //se o 2� valor for menor que 3�; e o 3� valor for menor que 1;
			System.out.println("A ordem crescente ficou "+n2+" "+n3+" "+n1+".");
		} else if ((n3<n1)&&(n1<n2)) { //se o 3� valor for menor que 1�; e o 1� valor for menor que 2;
			System.out.println("A ordem crescente ficou "+n3+" "+n1+" "+n2+".");
		} else                         //se n�o for nenhuma, a ordem crescente ser� n3 < n2 < n1;
			System.out.println("A ordem crescente ficou "+n3+" "+n2+" "+n1+".");
		
		} catch (Exception e) {
			System.out.println("Erro. Digite somente n�meros!!!"+e);
		}

		sc.close();
		}
	
	}
