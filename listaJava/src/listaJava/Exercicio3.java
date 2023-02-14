package listaJava;

//3) Imprima todos os múltiplos de 5, entre 1 e 100.
public class Exercicio3 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + "\n");
			}
		}
	}
}