import java.util.Scanner;

public class CalculadoraDeImc {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double altura, peso, imc;

		System.out.print("Sua altura em polegadas: ");
		altura = teclado.nextDouble();

		System.out.print("Seu peso em libras: ");
		peso = teclado.nextDouble();

        peso = peso / 2.20462;
        altura = altura / 39.3701;

		imc = (peso) / (altura * altura);
		System.out.println("Seu IMC é " + imc);
		teclado.close();
	}
}