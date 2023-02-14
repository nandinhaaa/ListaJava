package listaJava;

import java.util.Locale;
import java.util.Scanner;
/*6) Faça um programa que, a partir da leitura das medidas dos lados de um retângulo
(comprimento e largura), lidos do teclado, calcule e imprima a área e o perímetro do retângulo.*/
public class Exercicio6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double comprimento;
		double largura;
		double area;
		double perimetro;
		
		System.out.println("Digite o comprimento = ");
		comprimento = sc.nextDouble();
		System.out.println("Digite a largura = ");
		largura = sc.nextDouble();
		
		area = comprimento * largura;
		System.out.printf("A área é de: %.2f%n", area);
		
		perimetro = comprimento + comprimento + largura + largura;
		System.out.printf("O perimetro é de: %.2f%n", perimetro);
		sc.close();
}
}