/*
 * 5) A condição física de uma pessoa pode ser medida com base no cálculo do
 * índice de Massa Corporal (IMC). Faça um programa que calcule o IMC com base
 * nos dados abaixo: IMC = PESO /(ALTURA)²
 * 
 * Condição IMC em (M)ulheres e (H)omens: Abaixo do Peso: M&lt;19,1 H&lt;20,7
 * Peso ideal: Mulheres 19,1 - 25,8 Homens 20,7 - 26,4 Acima disto considere
 * como obeso
 *
 */
package listaJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double imc = 0;
		double peso = 0;
		double altura = 0;
		String sexo;

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o seu Peso: ");
		peso = sc.nextDouble();

		System.out.print("Qual a sua Altura: ");
		altura = sc.nextDouble();

		System.out.print("Digite M para Mulher ou H para Homem: ");
		sexo = sc.next();

		imc = peso / (altura * altura);

		System.out.println("");

		if (sexo.equalsIgnoreCase("M")) {
			if (imc < 19.1) {
				System.out.println("Peso esta abaixo de 19.1 com o IMC de: " + imc);
			} else if (imc > 19.1 || imc <= 25.8) {
				System.out.println("Peso esta adequado para a sua altura, com o IMC de: " + imc);
			} else if (imc > 25.8) {
				System.out.println("Peso esta acima de 25,8 com o IMC de: " + imc);
			}
		} else if (sexo.equalsIgnoreCase("H")) {
			if (imc <= 20.7) {
				System.out.println("Peso esta abaixo de 20,7 com o IMC de: " + imc);
			} else if (imc > 20.7 || imc <= 26.4) {
				System.out.println("Peso adequado para a sua altura, com o IMC de: " + imc);
			} else if (imc > 26.4) {
				System.out.println("Peso acima de 26,4 com o IMC de: " + imc);
			}
			sc.close();
		}
	}
}