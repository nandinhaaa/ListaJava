package listaJava;

//2- Imprima a soma de 1 até 100.
public class Exercicio2 {
	public static void main(String[] args) {

		for (int x = 1; x < 100; x++) {
			int resultado = 0;
			int soma = 0;
			resultado += x;
			soma = x + 1;
			System.out.println(resultado + "  + 1 = " + soma);
		}
	}
}
