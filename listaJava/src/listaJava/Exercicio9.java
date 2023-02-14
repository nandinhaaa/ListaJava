package listaJava;

import java.util.Scanner;

/*9) Numa determinada região, o imposto sobre a propriedade é calculado a partir de duas
informações:
 Área total do terreno (m2)
 Área construída do terreno (m2)
O imposto é cobrado da seguinte maneira:

 R$ 5.00 para cada metro quadrado construído
 R$ 3.80 para cada metro não construído

Faça um programa que leia a área total do terreno, a área construída do terreno, calcule e
imprima o valor total a ser pago.*/

public class Exercicio9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		double areaTotal;
		double areaConstruida;
		double imposto;
		
		System.out.println("Digite a área total da propriedade: ");
		areaTotal = sc.nextDouble();
		
		System.out.println("Digite a área total da construção: ");
		areaConstruida = sc.nextDouble();
		
	
		areaTotal= (areaTotal - areaConstruida) * 3.80;
		areaConstruida = areaConstruida * 5.0;
		imposto = areaTotal+areaConstruida;
		System.out.println("O valor do imposto final é de: "+ imposto);
		
		
		sc.close();

	}

}
