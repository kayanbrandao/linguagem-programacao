import java.util.Scanner;

public class PalavraSecreta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String segredo = "valinhos", chute;

		System.out.print("Qual é a palavra secreta? ");
		chute = teclado.next();

		if (chute.equals(segredo) || chute.equals("ovo")) {
			System.out.println("Correto!");
		}
		else {
			System.out.println("Não, a palavra secreta não é \"" + chute + "\".");
		}

		if (chute == segredo) {
			System.out.println("(Este texto nunca vai aparecer.)");
		}

        teclado.close();
	}
}