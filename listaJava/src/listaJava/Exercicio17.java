/*17) Utilizando o for. Desenvolva um programa que receba um n�mero e uma letra e
mostre a letra repetida o n�mero de vezes correspondente ao n�mero recebido. Exemplo:
- Se informar: 12 B o resultado ser� BBBBBBBBBBBB*/
package listaJava;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		System.out.print("Digite uma letra: ");
		char letra = sc.next().charAt(0);

		for (int i = 0; i < num; i++) {
			System.out.print(letra);
		}

		sc.close();
	}
}
