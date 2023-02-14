/*11) Uma empresa de locação de veículos cobra pelo uso de seus veículos populares a partir
da seguinte regra:
 45.00 reais para cada dia de uso como custo fixo;
 0.50 centavos de real para cada quilômetro que exceder o total de quilômetros dados
de cortesia.
 A cada dia o usuário tem direito a 60 quilômetros de cortesia
 O usuário efetua o pagamento somente ao devolver o carro à empresa de locação.
Escreva um programa que leia o número de dias que o usuário ficou com o carro e a
quilometragem do mesmo e imprima o valor a ser pago.*/
package listaJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		   System.out.print("Quantos dias o veículo foi utilizado?  ");
	        int dias = sc.nextInt();
	        System.out.print("Qual a quilometragem rodada? ");
	        double quilometros = sc.nextDouble();

	    
	        double custoFixo = dias * 45.00;
	        double quilometrosEx= Math.max(quilometros - (dias * 60), 0);
	        double custoQuilometro = quilometrosEx * 0.50;
	        double totalAPagar = custoFixo + custoQuilometro;

	      
	        System.out.printf("O valor a ser pago é de R$ %.2f%n", totalAPagar);
	        sc.close();
	    }
	}