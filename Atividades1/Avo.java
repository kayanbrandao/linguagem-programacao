import java.util.Scanner;

public class Avo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        double renda, bonito;
        boolean permitido;

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        System.out.print("Digite sua renda mensal: ");
        renda = teclado.nextDouble();

        System.out.print("Quão bonito você é, em uma escala de 0.0 a 10.0? ");
        bonito = teclado.nextDouble();

        permitido = (idade > 25 && idade < 40 && (renda > 15000 || bonito >= 8.5));

        System.out.println("Permissão para namorar minha neta? " + permitido);
        teclado.close();
    }
}