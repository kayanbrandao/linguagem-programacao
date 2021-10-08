import java.util.Scanner;

public class ExpressoesBooleanas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;

		System.out.print("Digite dois números.\nPrimeiro: ");
		x = teclado.nextDouble();
		System.out.print("Segundo: ");
		y = teclado.nextDouble();

		a = (x < y);
		b = (x <= y);
		c = (x == y);
		d = (x != y);
		e = (x > y);
		f = (x >= y);

		System.out.println(x + " é menor que " + y + ": " + a);
		System.out.println(x + " é menor ou igual a " + y + ": " + b);
		System.out.println(x + " é igual a " + y + ": " + c);
		System.out.println(x + " não é igual a " + y + ": " + d);
		System.out.println(x + " é maior que " + y + ": " + e);
		System.out.println(x + " é maior ou igual a " + y + ": " + f);
		System.out.println();

		System.out.println(!(x < y) + " " + (x >= y));
		System.out.println(!(x <= y) + " " + (x > y));
		System.out.println(!(x == y) + " " + (x != y));
		System.out.println(!(x != y) + " " + (x == y));
		System.out.println(!(x > y) + " " + (x <= y));
		System.out.println(!(x >= y) + " " + (x < y));
        teclado.close();
	}
}
/*
    < | menor que
    > | maior que
    <= | menor igual
    >= | maior igual
    != | diferente que
    ! | negação
    == | igual
*/