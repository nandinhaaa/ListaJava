/*Utilizando for. Entrar com uma palavra e informar quantas letras “a” possui a palavra.
Dicas:
String palavra = “Amanda”;
palavra.length(); // retorna o tamanho da String
palavra.substring(0,1); // retorna a primeira letra do nome Amanda = “A”
palavra.substring(1,2); // retorna a segunda letra do nome Amanda = “m”
palavra.equals(“Amanda”); // método equals é utilizado para comparar duas Strings,
retorna verdadeiro ou falso, no caso Verdadeiro*/

package listaJava;
public class Exercicio14{
public static void main(String[] args) {
	String x = "Amanda";

	int total=0;

	for (int i=0;i<=x.length()-1;i++) {
		if (x.substring(i,i+1).equalsIgnoreCase("a"))
			total=total+1;
	}

	System.out.println(total);

}
}