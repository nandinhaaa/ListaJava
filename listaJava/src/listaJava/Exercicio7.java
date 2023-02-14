package listaJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	/*
	 * 7) Faça um programa para calcular a média final de um aluno a partir de
	 * quatro notas bimestrais. A média é calculada através de uma média aritmética
	 * simples (todos os bimestres têm o mesmo peso). Média Situação:
	 * 
	 * entre 0 e 3.49 reprovado entre 3.5 e 6.49 recuperação maior que 6.5 aprovado
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
			System.out.println("Erro nota está maior que 10 ou negativa!");
		} else if (notaFinal >= 6.5 && notaFinal <= 10) {
			System.out.println("Aprovado!");
		} else if (notaFinal > 3.5 && notaFinal <= 10) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!!");
		}

		sc.close();

	}

}
