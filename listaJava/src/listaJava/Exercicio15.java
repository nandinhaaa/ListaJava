/*15) Capicuas são números que lidos da esquerda para a direita, e vise versa, tem o
mesmo valor. Entrar com um número e informar se este é um capicuas.
Dica:
Métodos necessário length() e substring*/
package listaJava;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int n_invertido = 0, resultado = 0;
		int aux;
		System.out.println("Digite um valor: ");
		num = sc.nextInt();
		aux = num;
		do {
			resultado = aux % 10;
			aux = aux / 10;
			n_invertido = n_invertido * 10 + resultado;
		} while (aux != 0);
		if (num == n_invertido) {
			System.out.println("É uma capicua! ");
		} else {
			System.out.println("Não é uma Capicua! ");
		}
		sc.close();
	}
}
