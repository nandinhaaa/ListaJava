/*16) Utilizando while. Entrar com uma palavra e informar quantas letras “a” possui a
palavra.
Dica:
Métodos necessário length() e substring*/
package listaJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercicio16 {
	private static int Ocorrencia(String str, char ch) {

		Matcher matcher = Pattern.compile(String.valueOf(ch)).matcher(str);

		int cont = 0;
		while (matcher.find()) {
			cont++;
		}

		return cont;
	}

	public static void main(String[] args) {
		String str = "amor";
		char ch = 'a';

		System.out.println(" Ocorrencia " + Ocorrencia(str, ch) + " vezes da letra a.");
	}
}