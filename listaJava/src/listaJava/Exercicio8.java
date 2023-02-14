package listaJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double HP;
		double LP;
		double HA;
		double LA;
		double areaParede;
		double areaAzulejo;
		double qtdAzulejo;

		System.out.printf("Digite a altura e largura da parede: ");
		HP = sc.nextDouble();
		LP = sc.nextDouble();
		System.out.printf("Digite a altura e largura do azulejo: ");
		HA = sc.nextDouble();
		LA = sc.nextDouble();

		areaAzulejo = HA * LA;
		System.out.println("A area do azulejo é: " + areaAzulejo);

		areaParede = HP * LP;
		System.out.println("A area da parede é: " + areaParede);

		qtdAzulejo = areaParede / areaAzulejo;
		System.out.printf("A quantidade de Azulejos necessários é de: %.2f%n", qtdAzulejo);

		sc.close();

	}

}
