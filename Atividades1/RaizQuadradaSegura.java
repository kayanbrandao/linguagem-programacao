import java.util.Scanner;

public class RaizQuadradaSegura {
	public static void main( String[] args ) {
		Scanner teclado = new Scanner(System.in);
		double x, y;
        String resposta = " ";

        while(!resposta.equalsIgnoreCase("SIM!")){
            System.out.println("Você está pronto?");
            resposta = teclado.nextLine();
        }

		System.out.print("Digite um número e direi a sua raiz quadrada. ");
		System.out.print("(Sem número negativos, por favor.) ");
		x = teclado.nextDouble();

		while ( x < 0 ) {
			System.out.println("Não farei raiz quadrada de números negativos.");
			System.out.print("\nNovo número: ");
			x = teclado.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("A raiz quadrada de "+x+" é "+y);
        teclado.close();
	}
}