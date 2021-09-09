import java.util.Scanner;

public class ContinueAdivinhando {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segredo, palpite;

        segredo = 1 + (int) (Math.random() * 10);

        System.out.println("Eu escolhi um número entre 1 e 10.");
        System.out.println("Tente adivinhar.");
        System.out.print("Seu palpite: ");
        palpite = teclado.nextInt();

        while (segredo != palpite) {
            System.out.println("Errado. Tente novamente.");
            System.out.print("Seu palpite: ");
            palpite = teclado.nextInt();
        }

        System.out.println("Correto! Você é um(a) bom(a) adinhador(a).");
        teclado.close();
    }
}