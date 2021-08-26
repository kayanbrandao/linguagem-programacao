import java.util.Scanner;

public class MaquinaDoEsquecimento {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual é a capital da França?");
		teclado.next();

		System.out.println("Quanto é 6 multiplicado por 7?");
		teclado.nextInt();
        // A segunda pergunta explode quanto eu digito uma string

		System.out.println("Digite um numero entre 0.0 e 1.0.");
		teclado.nextDouble();
        // A segunda pergunta explode quanto eu digito uma string
        
		System.out.println("Tem algo a mais para dizer?");
		teclado.next();
	}
}