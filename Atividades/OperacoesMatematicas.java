public class OperacoesMatematicas {
	public static void main(String[] args) {
		int a, b, c, d, e, f, g;
		double x, y, z;
		String um, dois, ambos;

		a = 10;
		b = 27;
		System.out.println("a é" + a + ",b é" + b);

		c = a + b;
		System.out.println("a+b é " + c);
		d = a - b;
		System.out.println("a-b é " + d);
		e = a + b * 3;
		System.out.println("a+b*3 é " + e);
		f = b / 2;
		System.out.println("b/2 é " + f);
		g = b % 10;
		System.out.println("b%10 é " + g);

		x = 1.1;
		System.out.println("\nx é " + x);
		y = x * x;
		System.out.println("x*x é " + y);
		z = b / 2;
		System.out.println("b/2 é " + z);
		System.out.println();

		um = "cachorro";
		dois = "casa";
		ambos = um + dois;
		System.out.println(ambos + "\n\n\n\n");

        double num1, num2, result;
        num1 = 1;
        num2 = 2;
        result = num1 + num2;
        System.out.println("Soma: " + (int)result);
        result = num1 - num2;
        System.out.println("Subtracao: " + result);
        result = num1 * num2;
        System.out.println("Multiplicacao: " + result);
        result = num1 / num2;
        System.out.println("Divisao: " + result);
        result = num1 % num2;
        System.out.println("Resto da divisao: " + result);
	}
}