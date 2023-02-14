/*Uma empresa de turismo tem a seguinte tabela de pre�os para pacotes tur�sticos para
grupos:
N�mero de pessoas Pre�o (em reais) por um dia de hospedagem
1 at� 4 R$ 160,00 por pessoa
5 at� 8 R$ 120,00 por pessoa
Acima de 8 R$ 80, 00 por pessoa

Escreva um programa que leia o n�mero de pessoas que comprou*/
package listaJava;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int qtdPessoa;
		double valorPagar;
		
		System.out.println("Quantas pessoas ir�o se hospedar? ");
		qtdPessoa = sc.nextInt();
		
		if (qtdPessoa>=5 && qtdPessoa<=8) {
			valorPagar= qtdPessoa * 120; 
			System.out.println("O valor a ser pago � de: "+ valorPagar);
		}
		
		else if (qtdPessoa<=4) {
			valorPagar= qtdPessoa * 160; 
			System.out.println("O valor a ser pago � de: "+ valorPagar);
		}
		else if (qtdPessoa>8){
			valorPagar= qtdPessoa * 80; 
			System.out.println("O valor a ser pago � de: "+ valorPagar);
		}
	
		
		sc.close();
	}

}
