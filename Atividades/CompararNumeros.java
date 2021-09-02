import java.util.Scanner;

public class CompararNumeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double primeiro, segundo;
		
		System.out.print("Digite dois números. Primeiro: ");
		primeiro = teclado.nextDouble();
		System.out.print("Segundo: ");
		segundo = teclado.nextDouble();

		if (primeiro < segundo) 
			System.out.println(primeiro + " é menor que " + segundo);
		
		if (primeiro <= segundo) 
			System.out.println(primeiro + " é menor ou igual a " + segundo);
		
		if (primeiro == segundo) 
			System.out.println(primeiro + " é igual a " + segundo);
		
		if (primeiro >= segundo) 
			System.out.println(primeiro + " é maior ou igual a " + segundo);
	
		if (primeiro > segundo) 
			System.out.println(primeiro + " é maior que " + segundo);
		
		if (primeiro != segundo){
			System.out.println(primeiro + " não é igual a " + segundo);
            System.out.println("Ei!");
        }
	}
}