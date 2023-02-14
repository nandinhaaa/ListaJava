/*Uma empresa de turismo tem a seguinte tabela de preços para pacotes turísticos para
grupos:
Número de pessoas Preço (em reais) por um dia de hospedagem
1 até 4 R$ 160,00 por pessoa
5 até 8 R$ 120,00 por pessoa
Acima de 8 R$ 80, 00 por pessoa

Escreva um programa que leia o número de pessoas que comprou*/
package listaJava;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int qtdPessoa;
		double valorPagar;
		
		System.out.println("Quantas pessoas irão se hospedar? ");
		qtdPessoa = sc.nextInt();
		
		if (qtdPessoa>=5 && qtdPessoa<=8) {
			valorPagar= qtdPessoa * 120; 
			System.out.println("O valor a ser pago é de: "+ valorPagar);
		}
		
		else if (qtdPessoa<=4) {
			valorPagar= qtdPessoa * 160; 
			System.out.println("O valor a ser pago é de: "+ valorPagar);
		}
		else if (qtdPessoa>8){
			valorPagar= qtdPessoa * 80; 
			System.out.println("O valor a ser pago é de: "+ valorPagar);
		}
	
		
		sc.close();
	}

}
