package listaJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	/*
	 * 7) Fa�a um programa para calcular a m�dia final de um aluno a partir de
	 * quatro notas bimestrais. A m�dia � calculada atrav�s de uma m�dia aritm�tica
	 * simples (todos os bimestres t�m o mesmo peso). M�dia Situa��o:
	 * 
	 * entre 0 e 3.49 reprovado entre 3.5 e 6.49 recupera��o maior que 6.5 aprovado
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double notaFinal;

		System.out.println("Digite suas 4 notas: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		nota4 = sc.nextDouble();

		notaFinal = nota1 + nota2 + nota3 + nota4;
		if (notaFinal > 10 || notaFinal < 0) {
			System.out.println("Erro nota est� maior que 10 ou negativa!");
		} else if (notaFinal >= 6.5 && notaFinal <= 10) {
			System.out.println("Aprovado!");
		} else if (notaFinal > 3.5 && notaFinal <= 10) {
			System.out.println("Recupera��o!");
		} else {
			System.out.println("Reprovado!!");
		}

		sc.close();

	}

}
