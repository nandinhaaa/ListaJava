/*12) De forma simplificada, o IRPF Simples Anual pode ser calculado a partir das seguintes
regras, no caso de um contribuinte com anual dada:

 Caso o contribuinte ganhe até 10800.00 reais, ele está isento do pagamento

 Caso o contribuinte ganhe entre 10800.00 até 21600.00 reais, ele deve calcular o seu
IRPF Simples multiplicando sua renda por 0.15 (alíquota de 15%) e subtraindo da
multiplicação 1620.00 reais. ...............

 Quando o contribuinte ganhar a partir de 21600.01 reais, ele deve calcular seu IRPF
Simples multiplicando sua renda por 0.275 (alíquota de 27.5%) e subtrair da
multiplicação 4320.00 reais.................

Escreva um programa que leia o valor da renda de um contribuinte, imprimindo o IRPF
Simples a ser pago pelo mesmo.*/

package listaJava;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double IRPF = 0;
		double renda;
		System.out.println("digite sua renda: ");
		renda = sc.nextDouble();

		if (renda < 10800.00) {
			System.out.println("Você está isento!");
		}
		else if (renda > 10800.00 && renda <= 21600.00) {
			IRPF = (renda * 0.15) - 1620;
			System.out.println("O valor da seu IRPF é: "+ IRPF);
		} 
		else if (renda >= 21600.01) {

			IRPF = (renda * 0.275) - 4320;
			System.out.println("O valor da seu IRPF é: "+ IRPF);
		}

		sc.close();
	}

}
