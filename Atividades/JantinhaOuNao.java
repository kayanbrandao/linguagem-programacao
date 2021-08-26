import java.util.Scanner;

public class JantinhaOuNao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra;
		boolean sim, nao;

		System.out.println("Digite a palavra \"jantinha\", por favor.");
		palavra = teclado.next();

		sim = palavra.equals("jantinha");
		nao = !palavra.equals("jantinha");
		
		System.out.println("Você digitou o que foi pedido: " + sim);
		System.out.println("Você ignorou as instruções: " + nao);
		teclado.close();
	}
}