package listaJava;

import java.util.Locale;
import java.util.Scanner;

/*4) Fa�a um programa que leia pelo teclado um valor, em dolar, converta e imprima o mesmo
num valor em reais. Considere que $ 1.00 dolar seja equivalente a R$5.10*/
public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double real;
		double dolar;
		
		System.out.println("Digite o valor que voce quer converter em d�lar: ");
		real = sc.nextDouble();
		
			dolar = real * 5.10;
			System.out.printf("O valor em dolar �: R$ %.2f%n", dolar);
		sc.close();
		
		
	}

}
