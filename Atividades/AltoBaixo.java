import java.util.Scanner;

public class AltoBaixo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int segredo, chute, cont = 1;

		segredo = 1 + (int) (100 * Math.random());

		System.out.println("Estou pensado em um número entre 1 e 100.");
		System.out.println("Tente adivinhar!");
		System.out.print("> ");
		chute = teclado.nextInt();

		while (segredo != chute) {
			cont += 1;
			if (chute < segredo)
				System.out.print("Seu chute foi muito baixo.");

			if (chute > segredo)
				System.out.print("Seu chute foi muito alto.");

			System.out.print(" Tente novamente.\n> ");
			chute = teclado.nextInt();
		}

		System.out.println("Você adivinhou em "+ cont +" tentativas");
		teclado.close();
	}
}